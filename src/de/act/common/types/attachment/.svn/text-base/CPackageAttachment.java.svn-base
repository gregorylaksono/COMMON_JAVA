package de.act.common.types.attachment;

import java.util.Set;

import de.act.common.types.formulars.FormularError;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.packageitems.ItemPKG;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CPackageAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = 1884342531544396718L;

	public CPackageAttachment() {
		super(FormularType.PACKAGE);
	}

	public CPackageAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.PACKAGE);
	}

	public CPackageAttachment(CAbstractAttachment lastPkg) {
		super(lastPkg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.attachment.CAbstractAttachment#checkMandetoryFields()
	 */
	@Override
	public boolean checkMandetoryFields() {
		boolean ret = super.checkMandetoryFields();
		Set<ItemPKG> add = this.getItemPKG();
		boolean valid = add!=null && add.size()>0;
		if (valid) {
			int c =0;
			for(ItemPKG s:add){
				if (s==null) {
					valid = false;
					this.errorList.add(new FormularError(10, "Missing PackageItem row ", 5, "PackageItem", FormularType.PACKAGE));
					break;
				}
				if (s.getWgt()==null || s.getWgt()<=0.0) {
					valid= false;
					this.errorList.add(new FormularError(10, "Missing Weight in PackageItem row "+c, 5, "PackageItem/Weight", FormularType.PACKAGE));
					break;
				}
				if (s.getPcs()==null || s.getPcs()<=0) {
					valid= false;
					this.errorList.add(new FormularError(10, "Missing PCS in PackageItem row "+c, 5, "PackageItem/PCS", FormularType.PACKAGE));
					break;
				}
				if (s.getVol()==null || s.getVol()<=0.0) {
					valid= false;
					this.errorList.add(new FormularError(10, "Missing Volume in PackageItem row "+c, 5, "PackageItem/Volume", FormularType.PACKAGE));
					break;
				}
				if (s.getCommodity()==null) {
					valid= false;
					this.errorList.add(new FormularError(10, "Missing Commodity in PackageItem row "+c, 5, "PackageItem/Commodity", FormularType.PACKAGE));
					break;
				}
				if (s.getScc()==null) {
					valid= false;
					this.errorList.add(new FormularError(10, "Missing SCC in PackageItem row "+c, 5, "PackageItem/SCC", FormularType.PACKAGE));
					break;
				}
				c++;
			}
		}
		else {
			valid= false;
			this.errorList.add(new FormularError(10, "Missing Packageinformations", 5, "PackageItem", FormularType.PACKAGE));
		} 
		return ret && valid;
	}
}
