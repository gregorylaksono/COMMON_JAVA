/**
 * @file ManifestObject.java
 * @package de.act.batch.data.forms.manifest
 * @since 30.11.2005 13:41:55
 * @author Martin Sachs
 */
package de.act.common.types;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * @since 30.11.2005
 * @author Martin Sachs
 *
 */
public interface ManifestObject extends Serializable{

	public static final Color ULD_SHP_COLOR = new Color(244,235,191);
	public static final Color ULD_TYPE_SHP = new Color(246,226,115);
	public static final Color BULK_COLOR = new Color(240,253,240);
	public static final Color ULDCOLOR = new Color(244,235,191);
	public static final Color ULDTYPECOLOR = new Color(246,226,115);
	//  transient public static final Color UNBOOKEDBULK = new Color(130,145,255);
	//	transient public static final Color UNBOOKEDULDSHP = new Color(78,98,249);
	public static final Color NOTHING = Color.WHITE;
	public final static ImageIcon icon_uld = new ImageIcon("Images"+File.separator+"close.png");
	public final static ImageIcon icon_type = new ImageIcon("Images"+File.separator+"garrow.png");

	public Color getColor() ;

	public void setColor(Color col) ;

	Icon  getImage();

	ManifestObject ifInvalidGetRoot();

	Integer getPcs();

	Double getWgt();

	boolean isBooked();

	boolean isNothing();

	/**
	 * set wether the object is from a manifest to import it or not.
	 * if import is selected, each drop on desktop must try to 
	 * accept the Object with no discrepancies.
	 * @author Martin Sachs
	 * @since 1.0 - 19.06.2006
	 * @return void
	 */
	public void setImport(boolean isimport);

	public boolean isImport();

}
