package current.thread.track;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MonitorVehicleTracker {
	
	private final Map<String,MutablePoint> locations;
	
	public MonitorVehicleTracker(Map<String,MutablePoint> locations){
		this.locations = deepCopy(locations);
	}
	
	public synchronized Map<String,MutablePoint> getLocations(){
		return deepCopy(locations);
	}
	
	public synchronized MutablePoint getLocations(String id){
		MutablePoint point = locations.get(id);
		return point == null ? null:new MutablePoint(point);
	}
	
	public synchronized void setLocation(String id,int x , int y){
		MutablePoint point = locations.get(id);
		if(point == null)
			 throw new IllegalArgumentException("id不存在");
		point.x = x;
		point.y = y;
	}
	
	private static Map<String,MutablePoint> deepCopy(Map<String,MutablePoint> m){
		Map<String,MutablePoint> result = new HashMap<String,MutablePoint>();
		for(String id:result.keySet()){
			result.put(id, result.get(id));
		}
		return Collections.unmodifiableMap(result);
	}
	
}
