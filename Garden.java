/*class Garden{
	static String flowerNames[]={null,null,null,null,null};
	public static void getAllFlowersNames(){
		for(String k:flowerNames){
			String ref=k;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean createFlower(String flower){
		boolean isCreated=false;
		if(flower!=null){
			flowerNames[i]=flower;
			i++;
			isCreated=true;
		}else{
			System.out.println("Cann't be created..As it's null..");
		}
		return isCreated;
	}
	public static void main(String args[]){
		createFlower("Rose");
		createFlower("Lotus");
		createFlower("Lily");
		createFlower("Iris");
		createFlower("Jasmine");
		getAllFlowersNames();
	}
}*/



class Garden{
	static String flowerNames[]={null,null,null,null,null};
	public static void getAllFlowersNames(){
		for(String k:flowerNames){
			String ref=k;
			System.out.println(ref);
		}
	}
	static int i=0;
	public static boolean createFlower(String flower){
		boolean isCreated=false;
		if(flower!=null){
			flowerNames[i]=flower;
			i++;
			isCreated=true;
		}else{
			System.out.println("Cann't be created..As it's null..");
		}
		return isCreated;
	}
	public static boolean updateFloweName(String existingFlowerName,String newFlowerName){
		boolean isUpdated=false;
		for(int i=0;i<flowerNames.length;i++){
			if(flowerNames[i]==existingFlowerName){
				flowerNames[i]=newFlowerName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static String searchByFlowerName(String flower){
		for(String flowerName:flowerNames){
			if(flowerName==flower)
				System.out.println("The flower "+flowerName+" found");
		}
		return flower;
	}
	public static void main(String args[]){
		createFlower("Rose");
		createFlower("Lotus");
		createFlower("Lily");
		createFlower("Iris");
		createFlower("Jasmine");
		updateFloweName("Rose","Rosuu..");
		getAllFlowersNames();
		searchByFlowerName("Lotus");
	}
}