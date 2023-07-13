/*class Karnataka{
	static boolean isSaved;
	static String cityName[]={null,null,null,null,null};
	static int i=0;
	public static boolean addCity(String city){
		if(cityName.length>i){
			if(city!=null && city.length()>0){
				cityName[i]=city;
				i++;
				isSaved=true;
				System.out.println("City is added: "+isSaved);
			}
			else{
				System.out.println("Cann't add cities..");
	}
	}else{
		System.out.println("Size is full,cann't add elements to array");
	}
		return isSaved;
	}
	public static void main(String args[]){
		addCity("Gangavathi");
		addCity("Hospete");
		addCity("Koppal");
		addCity("Gadag");
		addCity("Ballary");
		addCity("Gangavathi");
		for(i=0;i<cityName.length;i++){
		String ref=cityName[i];
		System.out.println(ref);
		}
	}
}*/



class Karnataka{
	static boolean isSaved;
	static String cityNames[]={null,null,null,null,null};
	static int i=0;
	public static boolean addCity(String city){
		if(cityNames.length>i){
			if(city!=null && city.length()>0){
				cityNames[i]=city;
				i++;
				isSaved=true;
				//System.out.println("City is added: "+isSaved);
			}
			else{
				System.out.println("Cann't add cities..");
			}
		}else{
		System.out.println("Size is full,cann't add elements to array");
		}
		return isSaved;
	}
	public static void getAllCityNames(){
		for(String l:cityNames){
			String ref=l;
			System.out.println(ref);
		}
	}
	public static boolean updateCityName(String oldCityName,String newCityName){
		boolean isUpdated=false;
		for(int i=0;i<cityNames.length;i++){
			if(cityNames[i]==oldCityName){
				cityNames[i]=newCityName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static String getByCityName(String cityName){
		for(int i=0;i<cityNames.length;i++){
			if(cityNames[i]==cityName){
				String cName=cityNames[i];
				System.out.println("The "+cName+" found");
			}
		}
		return cityName;
	}
	public static void main(String args[]){
		addCity("Gangavathi");
		addCity("Hospete");
		addCity("Koppal");
		addCity("Ballary");
		addCity("Bangalore");
		updateCityName("Bangalore","Bengaluru");
		getAllCityNames();
		getByCityName("Koppal");
	}
}
	

