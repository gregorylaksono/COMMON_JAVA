package de.act.common.types.staticobjects;


/**
 * @author Henry
 */
public class RSFuelChar implements java.io.Serializable {

	private static final long serialVersionUID = -1452317439727933114L;
	private long fuelCharId;
	private RSAp apFrom;
	private RSAp apTo;
	private RSCo coFrom;
	private RSCo coTo;
	private RSAr arFrom;
	private RSAr arTo;
	private String caId;
	private Double value;
	private RSCur cur3lc;
	private RSVad vad;
	private Long add_id;

	public RSFuelChar() {
		
	}

	public RSFuelChar(long fuelCharId) {
		this.fuelCharId = fuelCharId;
	}

	public RSFuelChar(long fuelCharId, RSAp apFrom, RSCo coFrom,
			RSAr arFrom, RSAp apTo, RSCo coTo, RSAr arTo, String caId,
			Double value, RSCur cur3lc, RSVad vad) {
		this.fuelCharId = fuelCharId;
		this.apFrom = apFrom;
		this.coFrom = coFrom;
		this.arFrom = arFrom;
		this.apTo = apTo;
		this.coTo = coTo;
		this.arTo = arTo;
		this.caId = caId;
		this.value = value;
		this.cur3lc = cur3lc;
		this.vad = vad;
	}

	public long getFuelCharId() {
		return fuelCharId;
	}

	public void setFuelCharId(long fuelCharId) {
		this.fuelCharId = fuelCharId;
	}

	public RSAp getApFrom() {
		return apFrom;
	}

	public void setApFrom(RSAp apFrom) {
		this.apFrom = apFrom;
	}

	public RSAp getApTo() {
		return apTo;
	}

	public void setApTo(RSAp apTo) {
		this.apTo = apTo;
	}

	public RSCo getCoFrom() {
		return coFrom;
	}

	public void setCoFrom(RSCo coFrom) {
		this.coFrom = coFrom;
	}

	public RSCo getCoTo() {
		return coTo;
	}

	public void setCoTo(RSCo coTo) {
		this.coTo = coTo;
	}

	public RSAr getArFrom() {
		return arFrom;
	}

	public void setArFrom(RSAr arFrom) {
		this.arFrom = arFrom;
	}

	public RSAr getArTo() {
		return arTo;
	}

	public void setArTo(RSAr arTo) {
		this.arTo = arTo;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public RSCur getCur3lc() {
		return cur3lc;
	}

	public void setCur3lc(RSCur cur3lc) {
		this.cur3lc = cur3lc;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public Long getAdd_id()
	{
		return add_id;
	}

	public void setAdd_id(Long add_id)
	{
		this.add_id = add_id;
	}
	
	
}
