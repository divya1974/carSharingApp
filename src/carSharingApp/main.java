package carSharingApp;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

import carSharingApp.entities.activeRides;
import carSharingApp.entities.user;
import carSharingApp.entities.vehicle;
import carSharingApp.service.carSharingService;

public class main {

	public static void main(String[] args) {
		
System.out.print("hello");
List<user> userList = new ArrayList<user>();
List<vehicle> vehicleList = new ArrayList<vehicle>();
List<activeRides> activeRidesList = new ArrayList<activeRides>();


carSharingService service = new carSharingService();

user user1 = new user("divya1");
user user2 = new user("divya2");
user user3 = new user("divya3");
user user4 = new user("divya4");
user user5 = new user("divya5");
user user6 = new user("divya6");

vehicle vehicle1 = new vehicle("vehicle1");
vehicle vehicle2 = new vehicle("vehicle2");
vehicle vehicle3 = new vehicle("vehicle3");
vehicle vehicle4 = new vehicle("vehicle4");
vehicle vehicle5 = new vehicle("vehicle5");
vehicle vehicle6 = new vehicle("vehicle6");
vehicle vehicle7 = new vehicle("vehicle7");

service.addUser(user1);
service.addUser(user2);
service.addUser(user3);
service.addUser(user4);
service.addUser(user5);
service.addUser(user6);


service.addVehicle(user1.getUserId(), vehicle1);
service.addVehicle(user2.getUserId(), vehicle2);
service.addVehicle(user3.getUserId(), vehicle3);
service.addVehicle(user4.getUserId(), vehicle4);
service.addVehicle(user5.getUserId(), vehicle1);

activeRides activeRide1 = new activeRides(1,2,3,4,vehicle1.getVehicleId(),vehicle1.getVehicleuserId(),5);
activeRides activeRide2 = new activeRides(2,2,3,4,vehicle2.getVehicleId(),vehicle2.getVehicleuserId(),5);
activeRides activeRide3 = new activeRides(2,2,3,4,vehicle3.getVehicleId(),vehicle3.getVehicleuserId(),5);
activeRides activeRide4 = new activeRides(2,6,3,4,vehicle4.getVehicleId(),vehicle4.getVehicleuserId(),5);
activeRides activeRide5 = new activeRides(6,6,3,4,vehicle4.getVehicleId(),vehicle4.getVehicleuserId(),5);


service.addActiveRide(activeRide1);
service.addActiveRide(activeRide2);
service.addActiveRide(activeRide3);
service.addActiveRide(activeRide4);
service.addActiveRide(activeRide5);

for (activeRides a : service.searchActiveRides(1, 2, 3, 4)) {
	System.out.println(a.toString());
	}

System.out.println(service.searchActiveRides());

System.out.println(service.selectActiveRide(1, user6));
System.out.println(service.selectActiveRide(1, user6));	
System.out.println(service.selectActiveRide(1, user6));	
System.out.println(service.selectActiveRide(1, user6));	
System.out.println(service.selectActiveRide(1, user6));	
System.out.println(service.deselectActiveDrive(1, user6));
System.out.println(service.selectActiveRide(1, user6));
	
}
}
