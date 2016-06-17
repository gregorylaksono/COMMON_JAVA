/**
 * @author Admin
 * @since 14.03.2006
 */
package de.act.common.types.formulars;

import java.util.Date;

import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;

/**
 * @autor Admin
 * @since 14.03.2006
 * @return Returns the attNo.
 */
public interface IAttachment {

	public Integer getAttNo();

	public void setAttNo(Integer attNo);

	public String getAuth();

	public void setAuth(String auth);

	public String getCard();

	public void setCard(String card);

	public Date getCorr();

	public void setCorr(Date corr);

	public RSAdd getCreator();

	public void setCreator(RSAdd creator);

	public String getF_id() ;

	public void setF_id(String f_id) ;

	public Long getId();

	public void setId(Long id);

	public Boolean isDisplayable();

	public RFAwbNo getAwbNo();

	public void setAwbNo(RFAwbNo a);

	public void setNewCreatorAndId(RSAdd address);
	
	public void setNewCreatorAndId(RSAdd address, RSAp ap3lc);

	public boolean isWriteable();

	public boolean isSendable();
}