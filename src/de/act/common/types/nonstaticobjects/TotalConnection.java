package de.act.common.types.nonstaticobjects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import de.act.common.types.nonstaticobjects.ConxFlights.Flight;

public class TotalConnection implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(TotalConnection.class);
	private static final long serialVersionUID = -7107260585325906763L;

	public static interface IdCollector {
		void addId(String id);
	} // interface IdCollector

	// this is our real data
	protected ConxFlights[] conxs = new ConxFlights[4];
	protected int len = 0;

	// this is data from the connections that we cache
	transient List<Date> deps = null;
	transient List<Date> arrs = null;
	transient List<String> vias = null;
	transient List<String> cas = null;
	transient List<String> depsString = null;
	transient List<String> arrsString = null;
	//private Boolean checked = new Boolean(false);

	private void initTimes() {
		if (this.deps != null && this.arrs != null) {
			return;
		}
		
		// handle the trivial cases first
		// no flights at all
		if (this.len <= 0) {
			this.deps = Collections.emptyList();
			this.arrs = Collections.emptyList();
			this.depsString = Collections.emptyList();
			this.arrsString = Collections.emptyList();
			// only direct flights
		} 
		else if (this.len == 1) {
			if(this.conxs[0].isFlightAvailable()){
				List<Flight> flts  = this.conxs[0].getFlights();
				Date[] ldeps = new Date[flts.size()];
				Date[] larrs = new Date[ldeps.length];
				String[] ldepsString = new String[ldeps.length];
				String[] larrsString = new String[ldeps.length];
				for (int i = 0; i < ldeps.length; i++) {
					Flight flt = flts.get(i);
					ldeps[i] = flt.getDep();
					larrs[i] = flt.getArr();
					ldepsString[i] = flt.getDepString();
					larrsString[i] = flt.getArrString();
				} // for i
				this.deps = Arrays.asList(ldeps);
				this.arrs = Arrays.asList(larrs);
				this.depsString = Arrays.asList(ldepsString);
				this.arrsString = Arrays.asList(larrsString);
			}
			// now we have the full package
		} 
		else {
			if(this.conxs[0].isFlightAvailable()){
				List<Flight> depFlts = this.conxs[0].getFlights();
				List<Flight> arrFlts = this.conxs[this.len - 1].getFlights();
				int n = depFlts.size() * 2;
				List<Date> ldeps = new ArrayList<Date>(n);
				List<Date> larrs = new ArrayList<Date>(n);
				List<String> ldepsString = new ArrayList<String>(n);
				List<String> larrsString = new ArrayList<String>(n);
				Date oldDep;
				int m = depFlts.size();
				n = arrFlts.size();
				int l = this.len - 1;
				int j = -1;

				// handle the degenerated case first!
				if (depFlts.size() <= 0) {
					// there are no valid flights!!!
					this.deps = Collections.emptyList();
					this.arrs = Collections.emptyList();
					this.depsString = Collections.emptyList();
					this.arrsString = Collections.emptyList();
					return;
				}

				//
				// first set the 'from' of all connections and add a first pair to
				// ldeps/larrs
				//
				Flight flt = depFlts.get(0);
				Date dep = flt.getDep();
				for (int k = 1; k <= l && flt != null; k++) {
					this.conxs[k].setFrom(flt);
					flt = this.conxs[k].getFirstFlight();
				} // for k
				if (flt == null) {
					// there are no valid flights!!!
					this.deps = Collections.emptyList();
					this.arrs = Collections.emptyList();
					this.depsString = Collections.emptyList();
					this.arrsString = Collections.emptyList();
					return;
				}

				// now add the 'real' pair
				ldeps.add(dep);
				larrs.add(flt.getArr());
				ldepsString.add(flt.getDepString());
				larrsString.add(flt.getArrString());
				oldDep = dep;

				//
				// now set the 'to' of all connections
				//
				flt = arrFlts.get(n - 1);
				for (int k = l - 1; k >= 0 && flt != null; k--) {
					this.conxs[k].setTo(flt);
					flt = this.conxs[k].getLastFlight();
				} // for k

				//
				// now fill the rest of the ldeps/larrs
				//
				for (int i = 1; i < m; i++) {
					flt = depFlts.get(i);
					dep = flt.getDep();
					int k;
					for (k = 1; k < l && flt != null; k++) {
						flt = this.conxs[k].getNextFlight(flt);
					} // for k
					if (flt == null) {
						// add last possible arrival times
						for ( ; j >= 0 && j < n; j++) {
							ldeps.add(oldDep);
							larrs.add(arrFlts.get(j));
							ldepsString.add(arrFlts.get(j).getDepString());
							larrsString.add(arrFlts.get(j).getArrString());
						}
						break; // we won't arrive in time
					}
					k = this.conxs[l].getNextFlightInt(flt);

					// add other possible arrival times for old departure time
					for ( ; j >= 0 && j < k && j < n; j++) {
						ldeps.add(oldDep);
						larrs.add(arrFlts.get(j));
						ldepsString.add(arrFlts.get(j).getDepString());
						larrsString.add(arrFlts.get(j).getArrString());
					}
					if (k >= n) {
						break; // we don't arrive in time
					}
					// now add the 'real' pair
					ldeps.add(dep);
					larrs.add(arrFlts.get(k));
					ldepsString.add(arrFlts.get(k).getDepString());
					larrsString.add(arrFlts.get(k).getArrString());
					oldDep = dep;
				} // for i

				// bring the result into shape
				Date[] ds = ldeps.toArray(new Date[ldeps.size()]);
				Date[] as = larrs.toArray(new Date[larrs.size()]);
				String[] dss = ldepsString.toArray(new String[ldepsString.size()]);
				String[] ass = larrsString.toArray(new String[larrsString.size()]);
				this.deps = Arrays.asList(ds);
				this.arrs = Arrays.asList(as);
				this.depsString = Arrays.asList(dss);
				this.arrsString = Arrays.asList(ass);
			}
		}
	}

	/**
	 * Returns the departure airport of the first flight or null in none was set.
	 *
	 * @return the departure airport of the first flight or null in none was set.
	 */
	public String getDeparture() {
		ConxFlights cf = this.conxs[0];
		if (cf == null || cf.deptAp == null) {
			return null;
		} 
		else {
			return cf.deptAp;
		}
	}
	/**
	 * Returns the destination airport of the last flight or null in none was set.
	 *
	 * @return the destination airport of the last flight or null in none was set.
	 */
	public String getDestination() {
		if (this.len < 1) {
			return null;
		}
		ConxFlights cf = this.conxs[this.len-1];
		if (cf == null || cf.destAp == null) {
			return null;
		} 
		else {
			return cf.destAp;
		}
	}

	public List<String> getVias() {
		// use the cache if possible
		if (this.vias != null) {
			return this.vias;
		}
		if (this.len <= 1) {
			this.vias = Collections.emptyList();
		}
		else {
			String[] vias = new String[this.len - 1];
			for (int i = 0; i < vias.length; i++) {
				ConxFlights cf = this.conxs[i];
				if (cf != null) {
					vias[i] = cf.destAp;
				}
			} // for i
			this.vias = Arrays.asList(vias);
		}
		if (this.vias==null|| this.vias.size()==0) {
			log.error("no via");
		}
		return this.vias;
	}
	public List<String> getAirlines() {
		// use the cache if possible
		if (this.cas != null) {
			return this.cas;
		}
		if (this.len <= 0) {
			this.cas = Collections.emptyList();
		} 
		else {
			String[] cas = new String[this.len];
			for (int i = 0; i < cas.length; i++) {
				ConxFlights cf = this.conxs[i];
				if (cf != null) {
					cas[i] = cf.caId;
				}
			} // for i
			this.cas = Arrays.asList(cas);
		}
		if (this.cas==null || this.cas.size()==0) {
			log.error("no carrierlist");
		}
		return this.cas;
	}

	/**
	 * @return Returns the ConnectionFlights.
	 */
	public List<ConxFlights> getConnections() {
		if (this.len <= 0) {
			return Collections.emptyList();
		} 
		else {
			return Arrays.asList(this.conxs).subList(0, this.len);
		}
	}

	/**
	 * Returns all possible departure times.
	 * The returned list has always the same length as the one returned by
	 * {@link getArrivals()}.
	 * The returned list is ordered with the earliest flight date first.
	 * Each date in the returned departure list matches the date with the same
	 * index in the arrival list (see {@link getArrivals()}).
	 * The same date can occur multiple times if this is necessary to match
	 * all arrival times in the arrival list.
	 *
	 * @return all possible departure times.
	 */
	public List<Date> getDepartures() {
		this.initTimes();
		return this.deps;
	}

	/**
	 * Returns all possible arrival times.
	 * The returned list has always the same length as the one returned by
	 * {@link getDepartures()}.
	 * The returned list is ordered with the earliest flight date first.
	 * Each date in the returned arrival list matches the date with the same
	 * index in the departure list (see {@link getDepartures()}).
	 * The same date can occur multiple times if this is necessary to match
	 * all departure times in the departure list.
	 *
	 * @return all possible arrival times.
	 */
	public List<Date> getArrivals() {
		this.initTimes();
		return this.arrs;
	}

	/**
	 * Collect the connections IDs.
	 * This method is only used internally during the build up phase
	 * of the schedule.
	 *
	 * @param idColl the IdCollector that actually collects the IDs.
	 */
	public void collectConxIds(final IdCollector idColl) {
		for (int i = 0; i < this.len; i++) {
			if (this.conxs[i] != null) {
				idColl.addId(this.conxs[i].conx);
			}
		} // for i
	}

	public String toString() {
		return "dep: " + this.getDeparture() +
				", arr: " + this.getDestination() +
				", times: " + this.getDepartures().size();
	}

	/**
	 * Simple equals helper method that is able to work with nulls.
	 *
	 * @param a
	 * @param b
	 *
	 * @return true if the two conxs have equal conxIds or both are null and
	 *         false otherwise.
	 */
	private boolean equals(final ConxFlights a, final ConxFlights b) {
		if (a == b) {
			return true;
		}
		if (a == null) {
			return b == null;
		}
		return a.conx.equals(b.conx);
	}

	public boolean equals(final Object other) {
		if (other instanceof TotalConnection) {
			TotalConnection o = (TotalConnection) other;
			if (o.len == this.len) {
				for (int i = 0; i < this.len; i++) {
					if (!equals(this.conxs[i], o.conxs[i])) {
						return false;
					}
				} // for i
				return true;
			}
		}
		return false;
	}

	private int hashCode(final ConxFlights cf) {
		return cf == null ? 0 : cf.conx.hashCode();
	}
	
	public int hashCode() {
		int hc = hashCode(this.conxs[0]);
		for (int i = 1; i < this.len; i++) {
			hc ^= hashCode(this.conxs[i]);
		}
		return hc;
	}

	public boolean checkConnections() {
		if (conxs==null || conxs.length==0) return false;
		for (ConxFlights c: this.conxs) {
			if (c!=null && !c.checkConnections()) {
				return false;
			}
		}
		return true;
	}

	public List<String> getDepsString()
	{
		return depsString;
	}

	public List<String> getArrsString()
	{
		return arrsString;
	}
	
	
} // class TotalConnection
