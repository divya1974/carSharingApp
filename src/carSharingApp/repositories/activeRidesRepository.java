package carSharingApp.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import carSharingApp.entities.activeRides;

public class activeRidesRepository {
	
	
	static public HashMap<Integer,activeRides> activeridecollection=new HashMap<Integer, activeRides>();

	public void addActiveRide(activeRides activeRide)
	{
		activeridecollection.put(activeRide.getActiveRideId(), activeRide);
		
	}


	public HashMap<Integer, activeRides> GetAllActiveRides()
	{
		return activeridecollection;
		
	}
	
	public  List<activeRides> getActiveRidesbyclosestDistance(Integer searchKey) {
		
		 Iterator iterator = activeridecollection.entrySet().iterator();
		 List<activeRides> list=new ArrayList<activeRides>();

	        while (iterator.hasNext()) {
	        	
	            activeRides obj = ((Entry<Integer, activeRides>) iterator.next()).getValue();
	            if(obj.getSearchKey().equals(searchKey))
	            list.add(obj);
	            	
	        }
		
		return list;
				
	}
	
	

	public  activeRides GetactiveRidebyId(Integer UId)
	{	    	
		return activeridecollection.get(UId);
			
	}


}
