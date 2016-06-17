/**
 *
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSFlt;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class APureManifest extends AManifestData implements Serializable {

	private static final long serialVersionUID = 622779520473075028L;
	private List<APureManifestItem> manifestItems = new ArrayList<APureManifestItem>();

	public APureManifest() {
		super();
	}

	public APureManifest(RSFlt flt, Date bkg_flt_date, RSAdd address, Date d, String state,RSAdd creator) {
		super(flt,bkg_flt_date,address,d,state,creator);
	}

	public  final List<APureManifestItem> getManifestItems() {
		return manifestItems;
	}

	public  final void setManifestItems(List<APureManifestItem> manifestItems) {
		this.manifestItems = manifestItems;
	}
}