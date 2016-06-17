/**
 * @author Martin Sachs
 * @since 15.02.2006
 */
package de.act.common.jmstypes;

import java.io.Serializable;

import de.act.common.types.User;
import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestData;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.ULDObject;

/**
 * @author Martin Sachs
 *
 */
public final class FormObjectMessageObject implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 15.02.2006
	 */
	private static final long serialVersionUID = -3039852783909902350L;
	public enum SendState {SEND,UPDATE,DELETE, MSG, FROMCENTRAL};
	private final User user;
	private final String message;
	private final RFForm forms;
	private final ULDObject uld;
	private final Shipments accItem;
	private final AManifestData manifest;
	private final SendState state;

	public FormObjectMessageObject(final User user, final AManifestData data, final SendState state) {
		super();
		this.user = user;
		this.manifest = data;
		this.state = state;
		this.forms = null;
		this.uld =null;
		this.accItem = null;
		this.message = null;
	}

	private FormObjectMessageObject(final User user,final RFForm form, final SendState st) {
		this.user = user;
		this.forms = form;
		this.state = st;
		this.uld =null;
		this.accItem = null;
		this.manifest = null;
		this.message = null;
	}

	private FormObjectMessageObject(final User user,final String msg, final SendState st) {
		this.user = user;
		this.forms = null;
		this.state = st;
		this.uld =null;
		this.accItem = null;
		this.manifest = null;
		this.message = msg;
	}
	public static FormObjectMessageObject createMessage(final User u,final RFForm form, final SendState st) {
		return new FormObjectMessageObject(u,form,st);
	}
	public static FormObjectMessageObject createMessage(final User u,final AManifest form, final SendState st) {
		AManifestData data = new AManifestData(form);
		return new FormObjectMessageObject(u,data,st);
	}

	public static FormObjectMessageObject createMessage(final User u,final AManifestData form, final SendState st) {
		AManifestData data = new AManifestData(form);
		return new FormObjectMessageObject(u,data,st);
	}

	public static FormObjectMessageObject createMessage(final User u,final String msg, final SendState st) {
		return new FormObjectMessageObject(u,msg,st);
	}

	public  RFForm getForms() {
		return this.forms;
	}

	public  SendState getState() {
		return this.state;
	}

	public  User getUser() {
		return this.user;
	}

	public  String getMessage() {
		return this.message;
	}

	public Shipments getAccItem() {
		return this.accItem;
	}

	public AManifestData getManifest() {
		return this.manifest;
	}

	public ULDObject getUld() {
		return this.uld;
	}
}
