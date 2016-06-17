package de.act.common.types.staticobjects;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CCommodityTree implements ICommodityTree, java.io.Serializable {
	/**
	 * Logger for this class
	 */
	transient private static final Logger log = Logger.getLogger(CCommodityTree.class);
	transient private static final long serialVersionUID = -908684886942415197L;
	private Long id;
	private ICommodityTree parent;
	transient private Set<ICommodityTree> childs;
	private Set<RSAnn> annotations;
	private Set<CommodityDGR> comDGRs; // view
	private Set<CommodityAVI> comAVIs;
	private Set<CommodityClass> comClass; //transient
	transient private Set<CommodityItem>  comItem;
	private CommodityScc commodityScc;
	transient private Set<ICommodityTree> original_childs;
	private Long parentId = null;
	private String name = null;
	private String awbName  = null;
	private String flag = null;
	private Integer level = null;
	private RSVad vad = null;
	private RSAnn annotation;
	private CommodityItem commodityItem;
	private CommodityDGR comDGR;                                                   
	private CommodityAVI comAVI;
	private Boolean avi = false;
	private Boolean dgr = false;
	private Integer creator = null;
	private Date createDate = null;
	private final static int baseHash = CCommodityTree.class.getName().hashCode() * 2 + 1;
	private RDDefCom defCom;
	private Long addId;
	
	private List<CommodityScc> listCommodityScc;

	public Set<ICommodityTree> getCommodityChilds() {
		// return this.childs;
		return this.original_childs;
	}

	public Set<ICommodityTree> getChilds() {
		return this.original_childs;
		// try {
		// // log.error(UnicastRemoteObject.getClientHost());
		// } catch (ServerNotActiveException e1) {
		// log.error(e1.getMessage());
		// }
		// if (this.childs instanceof UnicastRemoteObject) {
		// UnicastRemoteObject unicast = (UnicastRemoteObject) this.childs;
		//
		// try {
		// if (UnicastRemoteObject.getClientHost().equals("192.168.1.15"))
		// if (this.childs instanceof RemoteablePersistentSet) {
		// RemoteablePersistentSet s = (RemoteablePersistentSet) this.childs;
		// Set internal = s.getInternalPersistenSet();
		// }
		// } catch (ServerNotActiveException e) {
		// log.error(" ",e);
		// }
		// }
		//
		// return this.childs;
	}

	public void setChilds(final Set<ICommodityTree> childs) {
		this.original_childs = childs;
		this.childs = childs;
		// making childs remoteable
		// RemoteablePersistentSet<ICommodityTree> remote = null;
		// Object obj= null;
		//
		// remote = new RemoteablePersistentSet<ICommodityTree>(childs);
		// obj = RmiRemoteMaker.makeRemote(remote, java.util.Set.class,
		// SecurityContextHolder.getContext());
		// this.childs = (Set) obj;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodityTree#getParent()
	 */
	public ICommodityTree getParent() {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodityTree#getComAVIs()
	 */
	public Set<CommodityAVI> getComAVIs() {
		return this.comAVIs;
	}

	public void setComAVIs(final Set<CommodityAVI> comAVIs) {
		this.comAVIs = comAVIs;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodityTree#getComDGRs()
	 */
	public Set<CommodityDGR> getComDGRs() {
		return this.comDGRs;
	}

	public void setComDGRs(final Set<CommodityDGR> comDGRs) {
		this.comDGRs = comDGRs;
	}

	public Set<RSAnn> getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(final Set<RSAnn> annotations) {
		this.annotations = annotations;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		else if (obj != null && obj instanceof CCommodityTree) {
			final CCommodityTree o = (CCommodityTree) obj;
			return o.getAwbName().equals(this.getAwbName());
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(baseHash).append(this.getAwbName()).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String ret = this.name;
		// annotations left and right
		if (this.annotation != null && this.annotation.ann_name != null) {
			if ("l".equals(this.annotation.ann_dsp)) {
				ret = this.annotation.ann_name + " " + this.name;
			} 
			else {
				ret = this.name + " " + this.annotation.ann_name;
			}
		} 
		else if (this.comAVI != null) {
			ret += "(" + this.comAVI.getScfName() + ")";
		} 
		else if (this.comDGR != null) {
			ret += "(" + this.comDGR.getPropName() + ")";
		}
		if (ret == null) {
			ret = "Please select ";
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getAnnotation()
	 */
	public RSAnn getAnnotation() {
		return this.annotation;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getAwbName()
	 */
	public String getAwbName() {
		return this.awbName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getComAVI()
	 */
	public CommodityAVI getComAVI() {
		return this.comAVI;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getComDGR()
	 */
	public CommodityDGR getComDGR() {
		return this.comDGR;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getFlag()
	 */
	public String getFlag() {
		return this.flag;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getId()
	 */
	public Long getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#isAVI()
	 */
	public Boolean isAVI() {
		while (this.parent != null) {
			if (this.commodityScc != null && this.commodityScc.getScc3LC().equalsIgnoreCase("avi")) {
				return true;
			} 
			else {
				return this.parent.isAVI();
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#isDGR()
	 */
	public Boolean isDGR() {
		while (this.parent != null) {
			if (this.commodityScc != null
					&& (this.commodityScc.getScc3LC().charAt(0) == 'r' || this.commodityScc.getScc3LC().charAt(0) == 'R')) {
				return true;
			}
			else {
				return this.parent.isDGR();
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getParentList()
	 */
	public Set<ICommodity> getParentList() {
		final Set<ICommodity> set = new LinkedHashSet<ICommodity>();
		set.add(this);
		if (this.parent != null) {
			set.addAll(this.parent.getParentList());
		}
		return set;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getCommodityScc()
	 */
	public RSScc getCommodityScc() {
		while (this.parent != null) {
			if (this.commodityScc != null) {
				return this.commodityScc.getScc();
			} 
			else {
				return this.parent.getCommodityScc();
			}
		}
		return null;
	}

	public void setCommodityScc(CommodityScc commodityScc) {
		this.commodityScc = commodityScc;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setParent(ICommodityTree parent) {
		this.parent = parent;
		if (parent!=null)
			this.parentId = parent.getId();
	}

	public Set<CommodityClass> getComClass() {
		return this.comClass;
	}

	public void setComClass(Set<CommodityClass> comClass) {
		this.comClass = comClass;
	}

	public Set<CommodityItem> getComItem() {
		return this.comItem;
	}

	public void setComItem(Set<CommodityItem> comItem) {
		this.comItem = comItem;
	}

	public CommodityScc getCommoditySccMap() {
		return this.commodityScc;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.staticobjects.ICommodity#setParentID(java.lang.Long)
	 */
	public void setParentId(Long comId) {
		this.parentId = comId;
	}

	public Boolean getAvi() {
		return this.avi;
	}

	public void setAvi(Boolean avi) {
		this.avi = avi;
	}

	public CommodityItem getCommodityItem() {
		return this.commodityItem;
	}

	public void setCommodityItem(CommodityItem commodityItem) {
		this.commodityItem = commodityItem;
	}

	public Boolean getDgr() {
		return this.dgr;
	}

	public void setDgr(Boolean dgr) {
		this.dgr = dgr;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public String getVadId() {
      return this.vadId;
    }

    public void setVadId(String vadId) {
      this.vadId = vadId;
    }*/

	public Long getParentId() {
		return this.parentId;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}

	public void setAwbName(String awbName) {
		this.awbName = awbName;
	}

	public void setComAVI(CommodityAVI comAVI) {
		this.comAVI = comAVI;
	}

	public void setComDGR(CommodityDGR comDGR) {
		this.comDGR = comDGR;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	/* (non-Javadoc)
	 * @see de.act.common.types.staticobjects.ICommodity#getComName()
	 */
	public String getComName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.staticobjects.ICommodity#setComName(java.lang.String)
	 */
	public void setComName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public List<CommodityScc> getListCommodityScc() {
		return listCommodityScc;
	}

	public void setListCommodityScc(List<CommodityScc> listCommodityScc) {
		this.listCommodityScc = listCommodityScc;
	}

	public RDDefCom getDefCom()
	{
		return defCom;
	}

	public void setDefCom(RDDefCom defCom)
	{
		this.defCom = defCom;
	}

	public Long getAddId() {
		return addId;
	}

	public void setAddId(Long addId) {
		this.addId = addId;
	}
	
	
}
