/**
 *
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class AManifest extends AManifestData implements Serializable {
	
	private static final long serialVersionUID = 622779520473075028L;
	private List<AManifestItem> manifestItems = new ArrayList<AManifestItem>();

	public List<AManifestItem> getManifestItems() {
		return manifestItems;
	}

	public void setManifestItems(List<AManifestItem> manifestItems) {
		this.manifestItems = manifestItems;
	}
}


