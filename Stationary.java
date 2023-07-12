class Stationary {
	static String stationaryItems[]={null,null,null,null,null,null,null,null};
	static int index=0;
	public static boolean addStationaryItems(String itemName){
		System.out.println("Invoking addStationaryItems");
		System.out.println("No. Of Parameters:1, Type Of Parameter:String");
		boolean isAdded=false;
		if(itemName!=null){
			if(stationaryItems.length>index){
				stationaryItems[index++]=itemName;
			   isAdded=true;
		}else{
			System.out.println(" ");
		}
		}
	     else{
			System.out.println("Items cann't be null..");
		}
		return isAdded;	
	}
	public static boolean editStationaryItemName(String updatedItemName,String existingIemName){
		System.out.println("Invoking editStationaryItemName");
		System.out.println("No. Of Parameters:2, Type Of Parameters:String");
		boolean isEdited=false;
		for(int i=0;i<stationaryItems.length;i++){
			if(stationaryItems[i]==existingIemName){
				stationaryItems[i]=updatedItemName;
				isEdited=true;
			}
		}
		return isEdited;
	}
	public static void getAllStationaryItems(){
		for(int i=0;i<stationaryItems.length;i++){
			System.out.println(stationaryItems[i]);
		}
	}
	public static int deleteStationaryItemName(String item){
		int index;
		int noOfElements=stationaryItems.length;
		boolean isDeleted=false;
		for(index=0;index<stationaryItems.length;index++){
			if(stationaryItems[index]==item){
				break;
			}
		}
		if(index<noOfElements){
		   noOfElements=noOfElements-1;
		   for(int newIndex=index;newIndex<noOfElements;newIndex++){
			//logic to remove deleted data from the array
			stationaryItems[newIndex]=stationaryItems[newIndex+1];
		   }
		}
		System.out.println(noOfElements);
		return noOfElements;
	}
	public static void getAllStationaryItemsPostDeletion(int newLength){
		for(int index=0;index<newLength;index++){
			System.out.println(stationaryItems[index]);
		}
	}
	public static String searchStationaryItemByName(String itemName){
		System.out.println("Invoking searchStationaryItemByName");
		System.out.println("No Of Parameter:1, Type:String");
		String sName=null;
		for(String name:stationaryItems){
			if(name.equals(itemName)){
				sName=name;
				System.out.println("The search item found");
			}
				
		}
		return itemName;
	}
	public static void main(String args[]){
		//add,save,create
		addStationaryItems("Books");
		addStationaryItems("Pencil");
		addStationaryItems("Pen");
		addStationaryItems("Eraser");
		addStationaryItems("SketchPens");
		addStationaryItems("Ink Pen");
		addStationaryItems("Safety Pin");
		addStationaryItems("Charts");
		
		editStationaryItemName("Cardboard Sheets","Safety Pin");   //update,edit
		getAllStationaryItems();  //Read,get
		searchStationaryItemByName("Ink Pen");
		//delete,remove
		int newLength=deleteStationaryItemName("Eraser");
		getAllStationaryItemsPostDeletion(newLength);
	}
}