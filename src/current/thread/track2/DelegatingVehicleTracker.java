
package current.thread.track2;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class DelegatingVehicleTracker {
	
	private final ConcurrentMap<String, Point> locations;
	private final Map<String,Point> unmodifitableMap;
	
	public DelegatingVehicleTracker(Map<String,Point> points){
		locations = new ConcurrentHashMap<String,Point>(points);
		this.unmodifitableMap = Collections.unmodifiableMap(locations);
	}
}
