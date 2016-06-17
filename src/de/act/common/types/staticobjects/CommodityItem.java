/**
 * @author Martin Sachs
 * @since 06.03.2006
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.Set;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommodityItem implements Serializable {

	private static final long serialVersionUID = -4891910265728722907L;
	private String id;
	private RSAnn annotation;
	private String itemNo;
	private Set<Long> rules;
	private RSVad validation;

	public CommodityItem() {
		
	}

	public RSAnn getAnnotation() {
		return this.annotation;
	}

	public void setAnnotation(final RSAnn annotation) {
		this.annotation = annotation;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(final String item_no) {
		this.itemNo = item_no;
	}

	public Set<Long> getRules() {
		return rules;
	}

	public void setRules(Set<Long> rules) {
		this.rules = rules;
	}

	public RSVad getValidation() {
		return this.validation;
	}

	public void setValidation(final RSVad validation) {
		this.validation = validation;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}
}
