package de.act.common.types.handling;


public class AULDTrans implements java.io.Serializable {

	private static final long serialVersionUID = -1855139454734061454L;
	private Long uldId;
	private String uldTransMode;
	private String uldDest;
	private Long uldUser;
	private Long uldConsignee;

	public AULDTrans() {
		
	}

	public AULDTrans(String uldTransMode) {
		this.uldTransMode = uldTransMode;
	}

	public AULDTrans(String uldTransMode, String uldDest, Long uldUser, Long uldConsignee) {
		this.uldTransMode = uldTransMode;
		this.uldDest = uldDest;
		this.uldUser = uldUser;
		this.uldConsignee = uldConsignee;
	}

	public Long getUldId() {
		return this.uldId;
	}

	public void setUldId(Long uldId) {
		this.uldId = uldId;
	}

	public String getUldTransMode() {
		return this.uldTransMode;
	}

	public void setUldTransMode(String uldTransMode) {
		this.uldTransMode = uldTransMode;
	}

	public String getUldDest() {
		return this.uldDest;
	}

	public void setUldDest(String uldDest) {
		this.uldDest = uldDest;
	}

	public Long getUldUser() {
		return this.uldUser;
	}

	public void setUldUser(Long uldUser) {
		this.uldUser = uldUser;
	}

	public Long getUldConsignee() {
		return this.uldConsignee;
	}

	public void setUldConsignee(Long uldConsignee) {
		this.uldConsignee = uldConsignee;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	 @Override
	 public String toString() {
		 StringBuffer sb = new StringBuffer();
		 sb.append(this.uldId);
		 sb.append(" [");
		 sb.append(this.uldTransMode);sb.append(", ");
		 sb.append(this.uldDest);sb.append(", ");
		 sb.append(this.uldUser);sb.append(", ");
		 sb.append(this.uldConsignee);
		 sb.append("]");
		 return sb.toString();
	 }
}