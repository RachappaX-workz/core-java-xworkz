/*class Metro{
	static String stationNames[]={null,null,null,null,null,null,null};
	public static void getAllMetroStationNames(){
		for(String m:stationNames){
			String ref=m;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean saveStationName(String station){
		boolean isSaved=false;
		if(station!=null){
			stationNames[i]=station;
			i++;
			isSaved=true;
		}else{
			System.out.println("cann't be saved..As it is null value..");
		}
		return isSaved;
	}
	public static void main(String args[]){
		saveStationName("Kempegowda Metro Station");
		saveStationName("Kranthiveera Sangolli Rayanna Metro Station");
		saveStationName("Mahalakshmi Metro Station");
		saveStationName("Lalbagh Metro Station");
		saveStationName("Magadi Road Metro Station");
		saveStationName("Vijaynagar Metro Station");
		saveStationName("Srirampur Metro Station");
		getAllMetroStationNames();
	}
}*/

class Metro{
	static String stationNames[]={null,null,null,null,null,null,null};
	public static void getAllMetroStationNames(){
		for(String m:stationNames){
			String ref=m;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean saveStationName(String station){
		boolean isSaved=false;
		if(station!=null){
			stationNames[i]=station;
			i++;
			isSaved=true;
		}else{
			System.out.println("cann't be saved..As it is null value..");
		}
		return isSaved;
	}
	public static boolean updateStationName(String existingStationName,String newStationName){
		boolean isUpdated=false;
		for(int i=0;i<stationNames.length;i++){
			if(stationNames[i]==existingStationName){
				stationNames[i]=newStationName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static String searchMetroByStationName(String stationName){
		for(String mNames:stationNames){
			if(mNames==stationName)
				System.out.println("The station "+mNames+" found");
		}
		return stationName;
	}
	public static void main(String args[]){
		saveStationName("Kempegowda Metro Station");
		saveStationName("Kranthiveera Sangolli Rayanna Metro Station");
		saveStationName("Mahalakshmi Metro Station");
		saveStationName("Lalbagh Metro Station");
		saveStationName("Magadi Road Metro Station");
		saveStationName("Vijaynagar Metro Station");
		saveStationName("Srirampur Metro Station");
		updateStationName("Kempegowda Metro Station","Nadaprabhu Kempegowda Metro Station");
		getAllMetroStationNames();
		searchMetroByStationName("Nadaprabhu Kempegowda Metro Station");
	}
}