/**
 * 
 */
package de.act.common.jmstypes;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class SerializableObject extends Object implements Serializable{

	private static final long serialVersionUID = 231909315559262779L;
	private Object objectTemplate;

	public Object getObjectTemplate() {
		return objectTemplate;
	}

	public void setObjectTemplate(Object objectTemplate) {
		this.objectTemplate = objectTemplate;
	}
}
