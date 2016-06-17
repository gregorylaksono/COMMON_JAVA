/**
 * @author Martin Sachs
 * @since 07.03.2006
 */
package de.act.common.types.formulars;

/**
 * @author Martin Sachs
 *
 * known contraints:
 *  'add'     , 'rt' , 'bkg', 'aci'       
 *  'bkg_item', 'sli', 'awb'     
 *  'awb_stat',
 *  'awb_item', 'avi', 'pkg', 'pkg_stat'  
 *  'avi_item', 'dgr'
 *  'dgr_item', 'acc'     ,
 *  'bkg_flt' , 'bkg_flt_stat'
 *
 * @note all types can have the same constraint. So if one updated, all data 
 *       must stored again
 */
public enum FormularType {
	// default attributes
	ADDRESS("add"),
	ACOUNING_INFORMATION("aci"),
	BKG_FLIGHT("bkg_flt"),
	BKG_FLIGHT_STATE("bkg_flt_stat"),
	AWB_STATE("awb_stat"),
	PACKAGE_STATE("pkg_stat"),
	ROUTING("rt"),

	// items
	BKG_ITEM("bkg_item"),
	AVI_ITEM("avi_item"),
	AWB_ITEM("awb_item"),
	DGR_ITEM("dgr_item"),
	//     SLI_ITEM("sli_item"), 
	SAD_ITEM("sad_item"),
	PACKAGE("pkg"),

	// formulars
	SLI("sli"),
	DGR("dgr"),
	AVI("avi"),
	SAD("sad"),
	AWB("awb"),
	ACCEPTANCE("acc"),
	BKG("bkg"),
	COO("coo"),
	NOTOC("notoc"),
	AVICHECK("avi_check"),
	WAREHOUSE("warehouse"),
	MANIFEST("manifest"), 
	MAIN("main"), 
	AWB_HOUSE("awb"), 
	SLI_ITEM("sli_item"), 
	DELIVERY("delivery"), 
	NOTIFY("notify");

	private String constaint;

	FormularType(String t) {
		this.constaint = t;
	}

	public final String getConstaint() {
		return constaint;
	}
}
