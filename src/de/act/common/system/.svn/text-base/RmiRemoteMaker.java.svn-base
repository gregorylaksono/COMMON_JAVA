package de.act.common.system;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.acegisecurity.context.SecurityContext;
import org.acegisecurity.context.SecurityContextHolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class provides only one static method that helps in making POJOs
 * callable from remote.
 * 
 * @author OB
 */
@SuppressWarnings("unchecked")
public class RmiRemoteMaker {
	/** Our logger. */
	private final static Log LOG = LogFactory.getLog(RmiRemoteMaker.class.getName());
	/**
	 * Remote interface to be able to call any method on any object via RMI.
	 */
	public static interface RemoteCaller extends Remote {
		/**
		 * Call the method with the given arguments.
		 * 
		 * @param method
		 *            the name of the method to call.
		 * @param args
		 *            the arguments used to call the method.
		 * @return the result of the method invocation.
		 * @throws Throwable
		 *             if the method throws an exception or isn't found.
		 */
		Object call(String method, Object[] args) throws Throwable;
	} // interface RemoteCaller
	/**
	 * A RemoteCallerImpl calls any method on any object via RMI.
	 */
	public static class RemoteCallerImpl extends UnicastRemoteObject implements RemoteCaller {
		private static final long     serialVersionUID = -4233154283906444549L;
		private final Object          obj;
		private final Method[]        methods;
		private final SecurityContext secCtx;

		/**
		 * Create a RemoteCallerImpl for the given object using the given
		 * security context.
		 * 
		 * @param obj
		 *            the object to make remote.
		 * @param secCtx
		 *            the security context to use.
		 * @throws RemoteException
		 *             if the super constructor fails.
		 */
		public RemoteCallerImpl(Object obj, SecurityContext secCtx) throws RemoteException {
			super(0);
			this.obj = obj;
			this.methods = obj.getClass().getMethods();
			this.secCtx = secCtx;            
		}

		/**
		 * Call the method with the given name and arguments on the object
		 * remoted by this RemoteCaller. The security context given in the
		 * constructor will be set before the method invocation.
		 * 
		 * @param methodName
		 *            the name of the method to call.
		 * @param args
		 *            the arguments for the method call.
		 * @return the return value of the method called.
		 */
		public Object call(String methodName, Object[] args) throws Throwable {
			methods: for (Method method : this.methods) {
				Class[] types = method.getParameterTypes();
				// first match the method name and number of arguments
				if (methodName.equals(method.getName())
						&& ((args == null && types.length == 0) || ( (args != null) && types.length == args.length) )) {
					// now match the arguments
					if (types.length > 0) {
						for (int i = 0; i < args.length; i++) {
							if (args[i] != null && !types[i].isInstance(args[i])) {
								continue methods;
							}
						} // for i
					}
					// handle security stuff
					if (secCtx != null) {
						SecurityContextHolder.setContext(secCtx);
					}
					// invoke the method
					try {
						return method.invoke(this.obj, args);
					} catch (InvocationTargetException ite) {
						LOG.warn("Exception in method invocation Methode: "+methodName+" info: "+ ite.getCause().getMessage());
						throw ite.getCause();
					} catch (Exception e) {
						LOG.error("Internal method invocation error.", e);
						throw e;
					}
				} // if name and number of args fit
			} // for method
			//
			// if we get here something went wrong!!!
			//
			StringBuffer mesg = new StringBuffer(512);
			mesg.append("Unable to find the method '");
			mesg.append(methodName);
			mesg.append("' accepting ");
			if (args == null || args.length <= 0) {
				mesg.append("no arguments");
			} 
			else {
				mesg.append("arguments '");
				mesg.append(args[0]);
				mesg.append("'");
				for (int i = 1; i < args.length; i++) {
					mesg.append(", '");
					mesg.append(args[i]);
					mesg.append("'");
				}
			}
			mesg.append(" for object: ");
			mesg.append(this.obj);
			LOG.error(mesg);
			throw new IllegalArgumentException(mesg.toString());
		}
	} // class RemoteCallerImpl
	/**
	 * The RemoteInvocationHandler is the part that really goes over the wire.
	 * It doesn't do anything remote itself. Thats why it is Serializable. Its
	 * only purpose is to catch the RemoteException and to make a
	 * RemoteAccessException out of it. The remoting part of the work is left to
	 * the RemoteCaller. Such a beast is created internally in the constructor.
	 */
	public static class RemoteInvocationHandler implements InvocationHandler, Serializable {
		private static final long  serialVersionUID = -4936817223500155524L;
		/* The thing really doing the remote call. */
		private final RemoteCaller caller;

		/**
		 * Create a new RemoteInvocationHandler for the given object using the
		 * given security context. A RemoteCaller for the remoting part of the
		 * work is created.
		 * 
		 * @param obj
		 *            the object to make remote.
		 * @param secCtx
		 *            the security context for the object.
		 * @throws RuntimeException
		 *             if creating the RemoteCaller fails with a
		 *             RemoteException.
		 */
		public RemoteInvocationHandler(Object obj, SecurityContext secCtx) {
			try {
				this.caller = new RemoteCallerImpl(obj, secCtx);
			} 
			catch (RemoteException re) {
				throw new RuntimeException(re);
			}
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			try {
				//System.out.println(proxy.getClass().getInterfaces()+" \nmethod.getName(): "+method.getName());
				return caller.call(method.getName(), args);
			} 
			catch (RemoteException re) {
				throw new RemoteException("Unable to call method '" + method.getName() + "'.", re);
			}
		}
	} // class RemoteInvocationHandler

	/**
	 * Makes a remote object out of an ordinary object and an interface it
	 * implements. A security context can be given to enable security checks for
	 * methods called from remote.
	 * 
	 * @param obj
	 *            the object that implements the functionality.
	 * @param interfaze
	 *            the interface that the object implements and that shall be
	 *            available to remote clients.
	 * @param secCtx
	 *            the security context to use.
	 * @return the object wrapped with a remoting shell.
	 * @throws RuntimeException
	 *             if creating a RemoteCaller fails with a RemoteException.
	 */
	public static Object makeRemote(Object obj, Class interfaze, SecurityContext secCtx) {
		// make a serializable proxy that contains a remote invocation handler.
		return Proxy.newProxyInstance(interfaze.getClassLoader(), new Class[] { interfaze }, new RemoteInvocationHandler(obj, secCtx));
	}
} // class RmiRemoteMaker
