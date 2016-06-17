/**
 * 
 */
package de.act.common.interfaces;

import de.act.common.types.CurrencySource;
import de.act.common.types.ruleobject.RCur;
import de.act.common.types.staticobjects.RSCur;

/**
 * @author Henry
 *
 */
public interface ICurrencyAction extends IAction
{
	public Integer saveDefaultCurrency(CurrencySource source);
	
	public CurrencySource getCurrencySource();
	
	public Double getExchangeRate(String currFrom, String currTo);
	
	public RSCur getCurrencyBy3lc(String curr);
	/*
	public Integer saveCurrencyRate(List<CurrencyRate> listCurRate);
	
	public List<CurrencyRate> getCurrencyRate();
	*/
}
