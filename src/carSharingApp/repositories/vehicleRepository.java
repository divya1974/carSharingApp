package carSharingApp.repositories;

import java.util.HashMap;
import java.util.Map.Entry;

import carSharingApp.entities.vehicle;

public class vehicleRepository {
	
	static public HashMap<Integer,vehicle> vehiclecollection=new HashMap<Integer, vehicle>();

	public void addVehicle(vehicle vehicle)
	{
		vehiclecollection.put(vehicle.getVehicleId(),vehicle);
		
	}


	public HashMap<Integer, vehicle> GetAllVehicles()
	{
		return vehiclecollection;
		
	}

	public vehicle GetVehiclebyId(Integer VId)
	{
		return vehiclecollection.get(VId);
	    	
	}

}
