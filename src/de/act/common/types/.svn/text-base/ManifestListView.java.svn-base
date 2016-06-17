package de.act.common.types;

import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.RSUldType;

/**
 * @author Martin Sachs
 * @since 1.0 - 21.07.2006
 */
public class ManifestListView extends AbstractManifestView {

	private static final long serialVersionUID = 4108889018129270963L;
	private boolean dummy;

	public ManifestListView() {
		super();
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param mani_id
	 * @param long1 
	 * @param first
	 */
	public ManifestListView(Long mani_id, Long long1, ULDObject first) {
		super(mani_id,long1,first);
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param mani_id
	 * @param long1 
	 * @param first
	 * @param ll_uld_no
	 */
	public ManifestListView(Long mani_id, Long long1, RSUldType first, Integer ll_uld_no) {
		super(mani_id,long1,first,ll_uld_no);
	}

	public ManifestListView(boolean b) {
		super();
		this.dummy = b;
	}

	public boolean isDummy() {
		return this.dummy;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param isDummy The isDummy to set.
	 */
	public synchronized final void setDummy(boolean isDummy) {
		this.dummy = isDummy;
	}
}
