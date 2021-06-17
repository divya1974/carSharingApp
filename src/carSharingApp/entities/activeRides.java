package carSharingApp.entities;
import java.io.*;
import java.util.*;

import carSharingApp.utility.carSharingServiceUtil;

public class activeRides {
	
	static Integer id=0;
	Integer activeRideId;
	Integer sourceLatitude;
	Integer sourceLongitude;
	
	Integer destinationLatitude;
	Integer destinationLongitude;
	
	Integer searchKey;
	
	Integer vehicleId;
	Integer userId;
	
	Integer allowedtravellers;
	List<user> listoftravellers;
	
	public activeRides(Integer sourceLatitude, Integer sourceLongitude, Integer destinationLatitude,
			Integer destinationLongitude, Integer vehicleId, Integer userId, Integer allowedtravellers) {
		this.activeRideId=++id;
		this.sourceLatitude = sourceLatitude;
		this.sourceLongitude = sourceLongitude;
		this.destinationLatitude = destinationLatitude;
		this.destinationLongitude = destinationLongitude;
		this.searchKey= carSharingServiceUtil.createSearchKey(sourceLatitude,sourceLongitude,destinationLatitude,destinationLongitude);
		this.vehicleId = vehicleId;
		this.userId = userId;
		this.allowedtravellers = allowedtravellers;
		this.listoftravellers = new ArrayList<user>();
	}
	
	
	public Integer getSearchKey() {
		return searchKey;
	}


	public void setSearchKey(Integer searchKey) {
		this.searchKey = searchKey;
	}


	public static Integer getId() {
		return id;
	}

	public static void setId(Integer id) {
		activeRides.id = id;
	}

	public Integer getActiveRideId() {
		return activeRideId;
	}

	public void setActiveRideId(Integer activeRideId) {
		this.activeRideId = activeRideId;
	}

	public Integer getSourceLatitude() {
		return sourceLatitude;
	}

	public void setSourceLatitude(Integer sourceLatitude) {
		this.sourceLatitude = sourceLatitude;
	}

	public Integer getSourceLongitude() {
		return sourceLongitude;
	}

	public void setSourceLongitude(Integer sourceLongitude) {
		this.sourceLongitude = sourceLongitude;
	}

	public Integer getDestinationLatitude() {
		return destinationLatitude;
	}

	public void setDestinationLatitude(Integer destinationLatitude) {
		this.destinationLatitude = destinationLatitude;
	}

	public Integer getDestinationLongitude() {
		return destinationLongitude;
	}

	public void setDestinationLongitude(Integer destinationLongitude) {
		this.destinationLongitude = destinationLongitude;
	}

	public Integer getVehicle() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer  getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAllowedtravellers() {
		return allowedtravellers;
	}

	public void setAllowedtravellers(Integer allowedtravellers) {
		this.allowedtravellers = allowedtravellers;
	}

	public List<user> getListoftravellers() {
		return listoftravellers;
	}

	public void setListoftravellers(List<user> listoftravellers) {
		this.listoftravellers = listoftravellers;
	}
	
	public String toString() {
		return 
				"Active Ride id :  "+ this.activeRideId + " " +
				"No. of allowed travellers :" + this.allowedtravellers+ " " +
				" User Id : "+ this.userId + " " +
				"Vegicle Id : " + this.vehicleId ;
		
	}
	
	
}
