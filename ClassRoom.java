class ClassRoom{
	static boolean isClassRoomOpen;
	public static void main(String args[]){
		openOrClose();
		openOrClose();
	}
	public static boolean openOrClose(){
		if(isClassRoomOpen==false){
			isClassRoomOpen=true;
			System.out.println("The class room is open..");
		}else if(isClassRoomOpen==true){
			isClassRoomOpen=false;
			System.out.println("The class room is close..");
		}
		return isClassRoomOpen;
	}
}