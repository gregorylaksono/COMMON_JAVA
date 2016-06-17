package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Sachs
 * @since 1.0 - 18.09.2006
 */
public class Schedule implements Serializable {

	private static final long serialVersionUID = 7394929951583511712L;
	private final List<TotalConnection> rawConnections;
	private List<TotalConnection> totalConnections = null;

	public Schedule(List<TotalConnection> conns) {
		this.rawConnections = conns;
	}

	public final List<TotalConnection> getRawConnections() {
		return rawConnections;
	}

	public final List<TotalConnection> getTotalConnections() {
		if (this.totalConnections == null) {
			synchronized(this) {
				if (this.totalConnections == null) {
					this.totalConnections = new ArrayList<TotalConnection>(this.rawConnections.size());
					for (TotalConnection tc : this.rawConnections) {
						if (tc.getArrivals() != null && tc.getArrivals().size() > 0) {
							this.totalConnections.add(tc);
						}
					}
				}
			} // sync
		}
		return totalConnections;
	}

	public Integer getConnectionCount() {
		return this.getTotalConnections().size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "-";
	}  
}
