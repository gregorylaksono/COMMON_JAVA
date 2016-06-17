package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RItem implements java.io.Serializable {

	private static final long serialVersionUID = -7853184717648797595L;
	private long RId;
	private RBase RBase;
	private Integer itemBool;
	private String itemNo;

	public RItem() {
		
	}

	public RItem(RBase RBase) {
		this.RBase = RBase;
	}

	public RItem(RBase RBase, Integer itemBool, String itemNo) {
		this.RBase = RBase;
		this.itemBool = itemBool;
		this.itemNo = itemNo;
	}

	public long getRId() {
		return this.RId;
	}

	public void setRId(long RId) {
		this.RId = RId;
	}

	public RBase getRBase() {
		return this.RBase;
	}

	public void setRBase(RBase RBase) {
		this.RBase = RBase;
	}

	public Integer getItemBool() {
		return this.itemBool;
	}

	public void setItemBool(Integer itemBool) {
		this.itemBool = itemBool;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
}
