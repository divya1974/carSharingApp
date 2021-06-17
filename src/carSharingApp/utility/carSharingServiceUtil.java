package carSharingApp.utility;

public final class carSharingServiceUtil {
	
	
	public static Integer createSearchKey(Integer sourceLatitude, Integer sourceLongitude, Integer destinationLatitude, Integer destinationLongitude) {
		
		String key=Integer.toString(sourceLatitude)+Integer.toString(sourceLongitude)+Integer.toString(destinationLatitude)+Integer.toString(destinationLongitude);
		
		return Integer.valueOf(key);
		
	}
	
	

}
