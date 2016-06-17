package de.act.common.interfaces.airlinemodule;

import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.views.AWBForm;

public interface IPrintAction extends IAction
{
	/**
	 *  Method to generate barcode label
	 *  
	 * @param printData contains data to print (or necessary parameter to get print data)
	 * 
	 * @return result Map
	 */
	public Map<String, Object> generateBarcodeLabel(Map<String, Object> printData);
	
	/**
	 * 	Method to load bytes from file
	 * 
	 * @param fileName File to be load
	 * 
	 * @return bytes of file data
	 */
	public byte[] getFileData(String fileName);
	
	public Map<String, Object> generatePDF(Map<String, Object> printData);

	public byte[] getFileDataPDF(String url);

	public Map<String, Object> generateText(Map<String, Object> printData);
	
	public Map<String, Object> generateBarcodeLabelOneFile(Map<String, Object> printData);
	
	public String generatePDFAwb(AWBForm awbForm, String type);	
}
