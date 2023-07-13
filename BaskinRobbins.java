/*class BaskinRobbins{
	static String iceCreamFlavors[]={null,null,null,null,null,null};
	static int i=0;
	public static boolean addFlavor(String flavor){
		boolean isAdded=false;
		if(flavor!=null){
			iceCreamFlavors[i]=flavor;
			i++;
			isAdded=true;
		}else{
			System.out.println("Cann't be added..As it is null..");
		}
		return isAdded;
	}
	public static void getAllIceCreamFlavors(){
		for(String l:iceCreamFlavors){
			String ref=l;
			System.out.println(ref);
		}
	}
	public static void main(String args[]){
		addFlavor("Classic Vanilla");
		addFlavor("Cookies'N Cream");
		addFlavor("Three Cheers Chocolate");
		addFlavor("Black Current");
		addFlavor("Hazelnut Rocher");
		addFlavor("Very Berry Strawberry");
		getAllIceCreamFlavors();
	}
}*/



class BaskinRobbins{
	static String iceCreamFlavors[]={null,null,null,null,null,null};
	static int i=0;
	public static boolean addFlavor(String flavor){
		boolean isAdded=false;
		if(flavor!=null){
			iceCreamFlavors[i]=flavor;
			i++;
			isAdded=true;
		}else{
			System.out.println("Cann't be added..As it is null..");
		}
		return isAdded;
	}
	public static void getAllIceCreamFlavors(){
		for(String l:iceCreamFlavors){
			String ref=l;
			System.out.println(ref);
		}
	}
	public static boolean updateFlavorName(String existingFlavorName,String newFlavorName){
		boolean isUpdated=false;
		for(int i=0;i<iceCreamFlavors.length;i++){
			if(iceCreamFlavors[i]==existingFlavorName){
				iceCreamFlavors[i]=newFlavorName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static String searchByFlavors(String flavorName){
		for(String flavors:iceCreamFlavors){
			if(flavors==flavorName){
				System.out.println("The flavor "+flavors+" found");
			}
		}
		return flavorName;
	}
	public static void main(String args[]){
		addFlavor("Vanilla");
		addFlavor("Cookies'N Cream");
		addFlavor("Three Cheers Chocolate");
		addFlavor("Black Current");
		addFlavor("Hazelnut Rocher");
		addFlavor("Very Berry Strawberry");
		updateFlavorName("Vanilla","Classic Vanilla");
		getAllIceCreamFlavors();
		searchByFlavors("Black Current");
	}
}