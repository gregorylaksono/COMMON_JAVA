/**
 * 
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class ConxFlights implements Serializable {

	public final static String NL = System.getProperty("line.separator");
	
	
	public static class Flight extends Date {
		private static final long serialVersionUID = -742152512958281977L;
		private final Date   arr;
		private final String fltId;
		private final String fltNo;
		private final String acType;
		private String caId = null;
		private String ca_2lc = null;
		//private Boolean checked = Boolean.FALSE;
		
		private Long acId;
		private String acReg;
		private Long acCompId;
		private Double maxDoorW;
		private Double maxDoorH;
		private Double maxDoorL;
		private Double maxFloorWgt;
		
		private String depString;
		private String arrString;
		
		/*Rony - 20140329*/
		private String open_for_cargo;
		
		private SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm");

		public Flight(final Date dep, final Date arr, final String fltId, final String fltNo, String acType) {
			super(dep.getTime());
			this.arr    = arr;
			this.fltId  = fltId;
			this.fltNo  = fltNo;
			this.acType = acType;
			
//			this.arrString = (arr.getYear()+1900) + ":" + arr.getMonth() + ":" + arr.getDate() + ":" + arr.getHours() + ":" + arr.getMinutes();
//			this.depString = (dep.getYear()+1900) + ":" + dep.getMonth() + ":" + dep.getDate() + ":" + dep.getHours() + ":" + dep.getMinutes();
			this.arrString = format.format(arr);
			this.depString = format.format(dep);
		}
		
		public Flight(final Date dep, final Date arr, final String fltId, final String fltNo, String acType, Long acId, String acReg, Long acCompId, Double maxDoorW, Double maxDoorH, Double maxDoorL, Double maxFloorWgt, String ca_2lc, String open_for_cargo) {
			super(dep.getTime());
			this.arr    = arr;
			this.fltId  = fltId;
			this.fltNo  = fltNo;
			this.acType = acType;
			this.acCompId = acCompId;
			this.acId = acId;
			this.acReg = acReg;
			this.maxDoorH = maxDoorH;
			this.maxDoorW = maxDoorW;
			this.maxDoorL = maxDoorL;
			this.maxFloorWgt = maxFloorWgt;
			
//			this.arrString = (arr.getYear()+1900) + ":" + arr.getMonth() + ":" + arr.getDate() + ":" + arr.getHours() + ":" + arr.getMinutes();
//			this.depString = (dep.getYear()+1900) + ":" + dep.getMonth() + ":" + dep.getDate() + ":" + dep.getHours() + ":" + dep.getMinutes();
			this.arrString = format.format(arr);
			this.depString = format.format(dep);
			this.ca_2lc = ca_2lc;
			
			/*Rony - 20140328*/
			this.open_for_cargo = open_for_cargo;
		}

		public Date getDep() {
			return this;
		}

		public Date getArr() {
			return this.arr;
		}

		public String getFltId() {
			return this.fltId;
		}

		public String getFltNo() {
			return this.fltNo;
		}

		public String getAcType() {
			return this.acType;
		}

		public String getCaId() {
			return this.caId;
		}
		void setCaId(String caId) {
			this.caId  = caId;
		}
		
		public Long getAcId()
		{
			return acId;
		}

		public void setAcId(Long acId)
		{
			this.acId = acId;
		}

		public String getAcReg()
		{
			return acReg;
		}

		public void setAcReg(String acReg)
		{
			this.acReg = acReg;
		}

		public Long getAcCompId()
		{
			return acCompId;
		}

		public void setAcCompId(Long acCompId)
		{
			this.acCompId = acCompId;
		}

		public Double getMaxDoorW()
		{
			return maxDoorW;
		}

		public void setMaxDoorW(Double maxDoorW)
		{
			this.maxDoorW = maxDoorW;
		}

		public Double getMaxDoorH()
		{
			return maxDoorH;
		}

		public void setMaxDoorH(Double maxDoorH)
		{
			this.maxDoorH = maxDoorH;
		}

		public Double getMaxDoorL()
		{
			return maxDoorL;
		}

		public void setMaxDoorL(Double maxDoorL)
		{
			this.maxDoorL = maxDoorL;
		}

		public Double getMaxFloorWgt()
		{
			return maxFloorWgt;
		}

		public void setMaxFloorWgt(Double maxFloorWgt)
		{
			this.maxFloorWgt = maxFloorWgt;
		}

		public String getDepString()
		{
			return depString;
		}

		public void setDepString(String depString)
		{
			this.depString = depString;
		}

		public String getArrString()
		{
			return arrString;
		}

		public void setArrString(String arrString)
		{
			this.arrString = arrString;
		}

		public String getCa_2lc()
		{
			return ca_2lc;
		}

		public void setCa_2lc(String ca_2lc)
		{
			this.ca_2lc = ca_2lc;
		}

		public String toString() {
			return "flt:" + this.getCaId() + this.getFltNo() + ", dep:" + super.toString() + ", arr:" + this.getArr();
		}
		
		/*Rony - 20140328*/
		public String getOpen_for_cargo() {
			return this.open_for_cargo;
		}

		public void setOpen_for_cargo(String open_for_cargo) {
			this.open_for_cargo = open_for_cargo;
		}		

		//	   /**
		//         * @author Martin Sachs
		//         * @since 1.0 - 22.09.2006
		//         * @param boolean1
		//         * @return void
		//         */
		//        public void setChecked(Boolean boolean1) {
		//     	  this.checked  = boolean1;
		//        }
		//
		//	   /**
		//         * @autor Martin Sachs
		//         * @since 1.0 - 22.09.2006
		//         * @return Returns the checked.
		//         */
		//        public final Boolean getChecked() {
		//            return checked;
		//        }
	} // class Flight

	private static final long serialVersionUID = 8802461723314599552L;
	private static final long MIN_TRANSFER_TIME = 1000L * 60L * 60L * 2L;

	String					conx;   // These variables aren't 'private' and 'final' 
	String					caId;   // so that they can be set by Hibernate.
	String					deptAp;
	String					destAp;
	private List<Flight>	flights = null;
	private int				from    = 0; // including
	private int				to      = 0; // excluding
	//    private Boolean checked = Boolean.FALSE;

	ConxFlights() {
		this.conx   = null;
		this.caId   = null;
		this.deptAp = null;
		this.destAp = null;
	}
	public ConxFlights(final String conx, final String caId, final String dept, final String dest) {
		this.conx   = conx;
		this.caId   = caId;
		this.deptAp = dept;
		this.destAp = dest;
	}

	public Boolean isFlightAvailable(){
		if(this.flights != null) return true;
		else return false;
	}

	public String getConx() {
		return this.conx;
	}
	
	public String getCaId() {
		return caId;
	}

	public String getDeptAp() {
		return deptAp;
	}

	public String getDestAp() {
		return destAp;
	}

	/**
	 * Returns all possible fligths for this connection.
	 *
	 * @return all possible fligths for this connection.
	 */
	public List<Flight> getFlights() {
		if(flights != null)
			return this.flights.subList(this.from, this.to);
		
		return new Vector<ConxFlights.Flight>();
	}

	public void setFlights(final List<Flight> flights) {
		this.flights = flights;
		this.from = 0;
		this.to = flights.size();

		if (this.to > 0 && flights.get(0).getCaId() == null) {
			for (Flight f : flights) {
				f.setCaId(this.caId);
			} // for : f
		} // if carrier not set
	}

	public Flight getFirstFlight() {
		return (this.from >= this.to) ? null : this.flights.get(this.from);
	}
	public Flight getLastFlight() {
		return (this.from >= this.to) ? null : this.flights.get(this.to - 1);
	}

	int getNextFlightInt(final Date minDep) {
		int idx = (minDep == null || this.flights == null || this.flights.size() == 0) ? 0 :
			Collections.binarySearch(this.flights, minDep);
		if (idx < 0) {
			idx = -idx - 1;
		}
		return idx;
	}
	int getNextFlightInt(final Flight prevFlight) {
		int idx = this.getNextFlightInt(prevFlight.getArr());
		String pCaId = prevFlight.getCaId();
		String pFltNo = prevFlight.getFltNo();
		long pArrTime = prevFlight.getArr().getTime();

		for ( ; idx < this.to; idx++) {
			Flight flt = this.flights.get(idx);
			// consider flights with stops (same airline, same flight number)
			if (pFltNo.equals(flt.getFltNo()) && pCaId.equals(flt.getCaId())) {
				break;
			}
			// consider transfer times for connecting flights
			if (flt.getDep().getTime() - pArrTime >= MIN_TRANSFER_TIME) {
				break;
			}
		}
		return idx;
	}
	private int getPrevFlightInt(final Date maxArr) {
		int idx = (maxArr == null) ? this.to - 1 :
			Collections.binarySearch(this.flights, maxArr, new Comparator<Date>() {
				public int compare(Date o1, Date o2) {
					if (o1 instanceof Flight) {
						o1 = ((Flight) o1).getArr();
					}
					if (o2 instanceof Flight) {
						o2 = ((Flight) o2).getArr();
					}
					return o1.compareTo(o2);
				}
			});
		if (idx < 0) {
			idx = -idx - 2;
		}
		return idx;
	}
	private int getPrevFlightInt(final Flight nextFlight) {
		// handle the trivial case first
		if (nextFlight == null) {
			return this.to;
		}
		int idx = Math.min(this.to - 1, this.getPrevFlightInt(nextFlight.getDep()));

		String nCaId = nextFlight.getCaId();
		String nFltNo = nextFlight.getFltNo();
		long nDepTime = nextFlight.getDep().getTime();

		// go backward in time until we found something
		for ( ; idx >= this.from; idx--) {
			Flight flt = this.flights.get(idx);

			// consider flights with stops (same airline, same flight number)
			if (nFltNo.equals(flt.getFltNo()) && nCaId.equals(flt.getCaId())) {
				break;
			}

			// consider transfer times for connecting flights
			if (nDepTime - flt.getArr().getTime() >= MIN_TRANSFER_TIME) {
				break;
			}
		}
		return idx;
	}

	int getFrom() {
		return this.from;
	}
	
	void setFrom(final Flight prevFlight) {
		this.from = Math.max(0, this.getNextFlightInt(prevFlight));
	}
	
	void setTo(final Flight nextFlight) {
		this.to = Math.min(this.flights.size(), this.getPrevFlightInt(nextFlight) + 1);
	}

	public Flight getNextFlight(final Date minDep) {
		int idx = this.getNextFlightInt(minDep);
		if (idx < to) {
			return this.flights.get(idx);
		} 
		else {
			return null;
		}
	}
	
	public Flight getNextFlight(final Flight prevFlight) {
		int idx = this.getNextFlightInt(prevFlight);
		if (idx < to) {
			return this.flights.get(idx);
		} 
		else {
			return null;
		}
	}

	/**
	 * Returns a list with the flights for this connection.
	 * The iterator starts at the given point in time.
	 *
	 * @param start the start for the list
	 *              (minimal departure of the first flight returned).
	 *
	 * @return a list with the flights for this connection.
	 */
	public List<Flight> getNextFlights(final Date start) {
		int beg = Math.max(this.from, this.getNextFlightInt(start));
		if (beg >= this.to) {
			return Collections.emptyList();
		} 
		else {
			return this.flights.subList(beg, this.to);
		}
	}
	public List<Flight> getNextFlights(final Flight prevFlight) {
		int beg = Math.max(this.from, this.getNextFlightInt(prevFlight));
		if (beg >= this.to) {
			return Collections.emptyList();
		} 
		else {
			return this.flights.subList(beg, this.to);
		}
	}

	public String toString() {
		return "ca:" + this.caId   + "," + "dept:" + this.deptAp + "," + "dest:" + this.destAp ;
	}
	
	public String toLongString() {
		StringBuilder ret = new StringBuilder(4096);
		ret.append(this.toString() + " :" + NL);
		for (Flight f : this.flights) {
			ret.append(f.toString() + NL);
		}
		return ret.toString();
	}
	//    /**
	//     * @author Martin Sachs
	//     * @since 1.0 - 22.09.2006
	//     * @return void
	//     */
	//    public Boolean getChecked() {
	//	   for (Flight f :this.flights) {
	//      	  	if (f.getChecked()) {
	//      	  	    return Boolean.TRUE;
	//      	  	}
	//         }
	//	   return Boolean.FALSE;
	//    }
	//    /**
	//     * @author Martin Sachs
	//     * @since 1.0 - 22.09.2006
	//     * @param checked The checked to set.
	//     */
	//    public final void setChecked(Boolean checked) {
	////        this.checked = checked;
	//        if (!checked) {
	//            for (Flight f :this.flights) {
	//         	  	f.setChecked(checked);
	//            }
	//        }else {
	//     	  boolean first = true;
	//     	  for (Flight f :this.flights) {
	//     		 	if (first) {
	//     		 	    f.setChecked(true);
	//     		 	    first = false;
	//     		 	}else {
	//     		 	    f.setChecked(false);
	//     		 	}
	//             }
	//        }
	//    }

	public boolean checkConnections() {
		if (this.flights==null || this.flights.size()==0) return false;
		for(Flight f:this.flights) {
			if (f==null || f.fltId==null) {
				return false;
			}
		}
		return true;
	}	
	
}