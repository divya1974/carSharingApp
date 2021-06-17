package carSharingApp.entities;

public class user {
	
	static Integer id=0;
	Integer userId;
	String username;
	Integer userVehicleId;
	
	public user(String username) {
		this.username = username;
		this.userId=++id;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserVehicleId() {
		return userVehicleId;
	}
	public void setUserVehicleId(Integer userVehicleId) {
		this.userVehicleId = userVehicleId;
	}
	
	
}
