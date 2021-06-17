package carSharingApp.entities;


public class vehicle {
	
	static Integer Id=0;
	Integer vehicleId;
	Integer vehicleuserId;
	String vehicleName;
	enum vehicleEnum {
		    CAR1,
		    CAR2,
		    CAR3
	}
	
	public vehicle(String vehicleName) {
		this.vehicleId=++Id;
		this.vehicleName = vehicleName;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public vehicle() {
		vehicleId=++Id;		
	}
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Integer getVehicleuserId() {
		return vehicleuserId;
	}
	public void setVehicleuser(Integer vehicleuserId) {
		this.vehicleuserId = vehicleuserId;
	}
	
}
