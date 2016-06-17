package de.act.common.types.nonstaticobjects;

import java.awt.Color;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.08.2006
 */
public enum ProcessStates {

	/**
	 * blauer AWB - AWB 1
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_SHIPPER("aw1", new Color(200,200,250,100)),

	/**
	 * weisser AWB - AWB 4
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_COPY("aw4",new Color(60,60,60,100)),

	/**
	 * roter AWB - AWB 6
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_RECIEVED_AT_LASTAIRPORT("aw6",new Color(255,84,65,100)),

	/**
	 * roter AWB - AWB 3
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_DELIVERY("aw3", new Color(255,84,65,100)),
	/**
	 * gruener AWB - AWB 2
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_CARRIER( "aw2", new Color(134,224,117,100)),
	/**
	 * gelber AWB - AWB 5
	 * 
	 * @author Martin Sachs
	 * @since 2.0 - 15.06.2006
	 */
	AWB_CONSIGNEE( "aw5", new Color(215,217,81,100)),
	SLI( "sli"),
	AVI( "avi"),
	DEFAULT_CARRIER  ( "00"),
	DGR("dgr"), BKG("bkg");

	final private String formularName;
	private Color color = Color.WHITE;

	private ProcessStates(final String formularName) {
		this.formularName = formularName;
	}

	private ProcessStates(final String formularName, Color c) {
		this.formularName = formularName;
		this.color = c;
	}

	public String getFormularName() {
		return formularName;
	}

	public Color getColor() {
		return color;
	}

	final public static ProcessStates getProcessState(String s) {
		if (s==null) return null;
		if (s.equals(ProcessStates.AVI.getFormularName())) {
			return ProcessStates.AVI;
		}
		else if (s.equals(ProcessStates.DGR.getFormularName())) {
			return ProcessStates.DGR;
		}
		else if (s.equals(ProcessStates.SLI.getFormularName())) {
			return ProcessStates.SLI;
		}
		else if (s.equals(ProcessStates.AWB_SHIPPER.getFormularName())) {
			return ProcessStates.AWB_SHIPPER;
		}
		else if (s.equals(ProcessStates.AWB_CARRIER.getFormularName())) {
			return ProcessStates.AWB_CARRIER;
		}
		else if (s.equals(ProcessStates.AWB_CONSIGNEE.getFormularName())) {
			return ProcessStates.AWB_CONSIGNEE;
		}
		else if (s.equals(ProcessStates.AWB_COPY.getFormularName())) {
			return ProcessStates.AWB_COPY;
		}
		else if (s.equals(ProcessStates.AWB_DELIVERY.getFormularName())) {
			return ProcessStates.AWB_DELIVERY;
		}
		else if (s.equals(ProcessStates.AWB_RECIEVED_AT_LASTAIRPORT.getFormularName())) {
			return ProcessStates.AWB_RECIEVED_AT_LASTAIRPORT;
		} 
		else if (s.equals(ProcessStates.BKG.getFormularName())) {
			return ProcessStates.BKG;
		}
		else 
			return ProcessStates.DEFAULT_CARRIER;
	}
}
