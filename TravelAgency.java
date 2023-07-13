/*class TravelAgency {
	static String touristPlaces[]={null,null,null,null,null,null,null,null};
	public static void getAllTouristPlaces(){
		for(String n:touristPlaces){
			String ref=n;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean saveTouristPlace(String place){
		boolean isSaved=false;
		if(place!=null){
			touristPlaces[i++]=place;
			isSaved=true;
		}else{
			System.out.println("Cann't save places..As it is null..");
		}
		return isSaved;
	}
	public static void main(String args[]){
		saveTouristPlace("Hampi");
		saveTouristPlace("Anjanadhri");
		saveTouristPlace("Dharmasthala");
		saveTouristPlace("Manthralayam");
		saveTouristPlace("Kukke Subhramanya");
		saveTouristPlace("Chik Mangalore");
		saveTouristPlace("Mysore");
		saveTouristPlace("Nandi Hills");
		updateTouristPlaceName("Chik Mangalore","Chikmangaluru");
		getAllTouristPlaces();
	}
}*/


class TravelAgency {
	static String touristPlaces[]={null,null,null,null,null,null,null,null};
	public static void getAllTouristPlaces(){
		for(String n:touristPlaces){
			String ref=n;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean saveTouristPlace(String place){
		boolean isSaved=false;
		if(place!=null){
			touristPlaces[i++]=place;
			isSaved=true;
		}else{
			System.out.println("Cann't save places..As it is null..");
		}
		return isSaved;
	}
	public static boolean updateTouristPlaceName(String existingToristPlaceName,String newTouristPlace){
		boolean isUpdated=false;
		for(int i=0;i<touristPlaces.length;i++){
			if(touristPlaces[i]==existingToristPlaceName){
				touristPlaces[i]=newTouristPlace;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static boolean deleteTouristPlace(String place){
		boolean isDeleted=false;
		int i;
		for(i=0;i<touristPlaces.length;i++){
			if(touristPlaces[i]==place)
				break;
		}
		int noOfElements=touristPlaces.length;
		noOfElements=noOfElements-1;
		System.out.println(noOfElements);
		if(i<noOfElements){
			for(int j=i;j<noOfElements;j++){
				touristPlaces[j]=touristPlaces[j+1];
			}
		}
		return isDeleted;
	}
	public static String searchByTouristPlace(String placeName){
		for(String touristPlaceNames:touristPlaces){
			if(touristPlaceNames==placeName)
				System.out.println("The tourist place "+touristPlaceNames+" found");
		}
		return placeName;
	}
	public static void main(String args[]){
		saveTouristPlace("Hampi");
		saveTouristPlace("Anjanadhri");
		saveTouristPlace("Dharmasthala");
		saveTouristPlace("Manthralayam");
		saveTouristPlace("Kukke Subhramanya");
		saveTouristPlace("Chik Mangalore");
		saveTouristPlace("Mysore");
		saveTouristPlace("Nandi Hills");
		updateTouristPlaceName("Chik Mangalore","Chikmangaluru");
		getAllTouristPlaces();
		deleteTouristPlace("Chikmangaluru");
		getAllTouristPlaces();
		searchByTouristPlace("Dharmasthala");
	}
}