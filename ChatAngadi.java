class ChatAngadi{

	public static void main(String args[]){
	    String chatNames[]={"Pani puri","Samosa","Bhel puri"};
		getChatNames(chatNames);   //invoking method/argument
	}
	public static void getChatNames(String chatNames[]){
		for(String i:chatNames){
			System.out.println(i);
		}
	} 
}
//1)Cannot write method iside the methods..
//2)Should be written one after the other..