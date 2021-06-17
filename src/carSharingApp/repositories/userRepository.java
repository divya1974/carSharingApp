package carSharingApp.repositories;

import java.util.HashMap;
import java.util.Map;

import carSharingApp.entities.user;

public class userRepository {
	
static public HashMap<Integer,user> usercollection=new HashMap<Integer, user>();

public void addUser(user user)
{
	usercollection.put(user.getUserId(),user);
	
}


public HashMap<Integer, user> GetAllUsers()
{
	return usercollection;
	
}

public  user GetUserbyId(Integer UId)
{
    	return usercollection.get(UId);
		
}

}
