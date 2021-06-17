package carSharingApp.service;

import java.util.List;
import java.util.Set;

import carSharingApp.entities.activeRides;
import carSharingApp.entities.user;
import carSharingApp.entities.vehicle;
import carSharingApp.repositories.activeRidesRepository;
import carSharingApp.repositories.userRepository;
import carSharingApp.repositories.vehicleRepository;
import carSharingApp.utility.carSharingServiceUtil;

public class carSharingService {
	
	public static userRepository userrepository = new userRepository();
	public static vehicleRepository vehiclerepository = new vehicleRepository();
	public static activeRidesRepository activeridesreposiory = new activeRidesRepository();
	
	
	public void addUser(user user) {
		userrepository.addUser(user);	
	}
	public void addVehicle(Integer userId,vehicle vehicle) {
		//add parameter input checks
		
		vehicle.setVehicleuser(userId);
		if(userrepository.GetUserbyId(userId)!=null) {
			userrepository.GetUserbyId(userId).setUserVehicleId(vehicle.getVehicleId());
		}
		vehiclerepository.addVehicle(vehicle);
	}
	
	public void addActiveRide(activeRides activeRide) {
		activeridesreposiory.addActiveRide(activeRide);	
	}
	
	public void deleteActiveRide() {
		
	} // extend later
	
	
	public List<activeRides> searchActiveRides(Integer sourceLatitude,Integer sourceLongitude, Integer destinationLatitude, Integer destinationLongitude) 
	{
		Integer key=carSharingServiceUtil.createSearchKey(sourceLatitude, sourceLongitude, destinationLatitude, destinationLongitude);
		return activeridesreposiory.getActiveRidesbyclosestDistance(key);		
	}
	
	public Set<Integer> searchActiveRides(){
		return activeridesreposiory.GetAllActiveRides().keySet();
	}	
	
	//handle case of showing activeRides which are filled seperately
	
	public boolean selectActiveRide(Integer activeRideId, user user) {
		activeRides ride= activeridesreposiory.GetactiveRidebyId(activeRideId);
		
		if(ride.getAllowedtravellers() > ride.getListoftravellers().size()) {
			List<user> listuser=ride.getListoftravellers();
			listuser.add(user);
			ride.setListoftravellers(listuser);
			return true;
		}
		return false;		
	}
	
	
	public boolean deselectActiveDrive(Integer activeRideId, user user) {
		
		activeRides ride= activeridesreposiory.GetactiveRidebyId(activeRideId);
			List<user> listuser=ride.getListoftravellers();
			boolean res=listuser.remove(user);
			ride.setListoftravellers(listuser);
			return res;

		}
	
}
