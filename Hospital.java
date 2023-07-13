/*class Hospital{
	static String hospitalName;
	static String hospitalLocation;
	static long hospitalContact;
	static int noOfBranches,noOfBeds; //Declaring Multiple Variables
	public static void main(String hospital[]){
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
	}
}*/
//Here compiler will give output with the default values

/*class Hospital{
	static String hospitalName;
	static String hospitalLocation;
	static long hospitalContact;
	static int noOfBranches;
	static int noOfBeds;
	hospitalName="ESI";
	hospitalLocation="Rajaji Nagar";
	hospitalContact=7676734340L;
	noOfBranches=15;
	noOfBeds=2000;
	public static void main(String hospital[]){
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
	}
}*/
//Here it will give 5 errors because Initializing seperately Outside the main function is not possible in JAVA

/*class Hospital{
	static String hospitalName;
	static String hospitalLocation;
	static long hospitalContact;
	static int noOfBranches;
	static int noOfBeds;
	static char doctorGender;
	public static void main(String hospital[]){
		hospitalName="ESI";
	    hospitalLocation="Rajaji Nagar";
	    hospitalContact=7676734340L;
	    noOfBranches=15;
	    noOfBeds=2000;
		doctorGender='M';
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
		System.out.println("The Gender of the Doctor is "+doctorGender);
		System.out.println(hospitalName.length());
		System.out.println(hospitalLocation.toUpperCase());
		System.out.println(hospitalLocation.indexOf("N"));
	}
}*/
//Here it'll give the output with the variable values

/*class Hospital{
	public static void main(String hospital[]){
		String hospitalName;
	    String hospitalLocation;
	    long hospitalContact;
	    int noOfBranches;
	    int noOfBeds;
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
	}
}*/
//Here it will give 5 Errors beacuse initialization is must inside the main function

/*class Hospital{
	public static void main(String hospital[]){
		String hospitalName;
	    String hospitalLocation;
	    long hospitalContact;
	    int noOfBranches;
	    int noOfBeds;
		hospitalName="ESI";
	    hospitalLocation="Rajaji Nagar";
	    hospitalContact=7676734340L;
	    noOfBranches=15;
	    noOfBeds=2000;
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
	}
}*/
//Here it will give correct output with the variable names..


/*class Hospital{
	public static void main(String hospital[]){
		hospitalName="ESI";
	    hospitalLocation="Rajaji Nagar";
	    hospitalContact=7676734340L;
	    noOfBranches=15;
	    noOfBeds=2000;
		String hospitalName;
	    String hospitalLocation;
	    long hospitalContact;
	    int noOfBranches;
	    int noOfBeds;
		System.out.println("The Hospital Name is "+hospitalName);
		System.out.println("The Hospital Location is "+hospitalLocation);
		System.out.println("The Total number of hospital branches are "+noOfBranches);
		System.out.println("The Hospital Contact number is "+hospitalContact);
		System.out.println("The Total number of beds in the hospital is "+noOfBeds);
	}
}*/
//Here it will give 5 Errors Hence we need to Declare the variables first and then we need to initialize the variable


