/*class Girias {
	static String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		
		
		
		//System.out.println(electronicDevices.length);
		//Syntac of FOR LOOP - for(decln & initn of var;condition;Increment/Decrement statement){
			
		//  }  
		//Relational Operators - <,>,<=,>=,!=,==,etc.. --Output - true/false
	
	
	    //for(int rvsIndex=electronicDevices.length-1;rvsIndex>=0;rvsIndex--)
		for(int rvsIndex=0;rvsIndex<electronicDevices.length;rvsIndex++){
			System.out.println(electronicDevices[rvsIndex]);
		}
		System.out.println("Main Ended");
	}
}*/

/*class Girias {
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
		           //0<8
		for(int i=0;i<=electronicDevices.length-1;i++){
			System.out.println(electronicDevices[i]);
		}
		System.out.println("Main Ended");
	}
}*/

/*class Girias {
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
		int priceOfElectronicDevices[]={10000,20000,30000,40000,50000,60000,70000,80000};
		for(int i=0;i<=electronicDevices.length-1;i++){
			System.out.println(electronicDevices[i]+" "+"The price is "+priceOfElectronicDevices[i]);
		}
		System.out.println("Main Ended");
	}
}*/



/*class Girias {
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
		double priceOfElectronicDevices[]={10000.0,20000.0,30000.0,40000.0,50000.0,60000.0,70000.0,80000.0};
		for(String electronicDevice:electronicDevices){
			System.out.println(electronicDevice);
		}
		for(double priceOfElectronicDevice:priceOfElectronicDevices){
			System.out.println("The price of electronicDevice"+" "+priceOfElectronicDevice);
		}
		System.out.println("Main Ended");
	}
}*/

/*class Girias{
	static String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
	public static void main(String args[]){
	for(int i=0;i<=electronicDevices.length-1;){
		System.out.println(electronicDevices[i]);
		i++;
	}
	}
}*/

/*class Girias {
	static String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
	public static void main(String args[]){
		int i=0;
		while(i<electronicDevices.length){
			System.out.println(electronicDevices[i]);
			i++;
		}
	}
}*/

/*class Girias {
	static String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
	public static void main(String args[]){
		System.out.println("Main Started\n");
		int i=0;
		do{
			System.out.println(electronicDevices[i]);
			i++;
		}while(i<electronicDevices.length);
		System.out.println("Main Ended");
	}
}*/

/*class Girias {
	static String e1;
	static String e2;
	public static void main(String args[]){
		System.out.println(e1+"\n"+e2);
	}
}*/

/*class Girias {
	public static void main(String args[]){
		String e1="Refrigerator";
	    String e2="Washing machine";
		String e3="Television";
		String e4="LED";
		String e5="Grinder";
		String e6="AC";
		String e7="Iron Box";
		String e8="Microwave";
		System.out.println("The Main Started\n"+e1+"\n"+e2+"\n"+e3+"\n"+e4+"\n"+e5+"\n"+e6+"\n"+e7+"\n"+e8+"\n"+"The Main Ended");
	}
}*/
                                                                                  //Using method concept
/*public class Girias {
	static void electronicDevices(){
		 String e1="Refrigerator";
	     String e2="Washing machine";
		 String e3="Television";
		 String e4="LED";
		 String e5="Grinder";
		 String e6="AC";
		 String e7="Iron Box";
		 String e8="Microwave";
		 System.out.println("The Main Started\n"+e1+"\n"+e2+"\n"+e3+"\n"+e4+"\n"+e5+"\n"+e6+"\n"+e7+"\n"+e8+"\n"+"The Main Ended");
		}
	public static void main(String args[]){
        electronicDevices();
	}
}*/


	

class Girias {
    static String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
	static double priceOfElectronicDevices[]={10000.0,20000.0,30000.0,40000.0,50000.0,60000.0,70000.0,80000.0};
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		getElectronicDevices();      //arguments
		getPriceOfElectronicDevices();
		System.out.println("Main Ended\n");
	}
	public static void getElectronicDevices(){
		System.out.println("The list of electronic Devices:");
		for(String i:electronicDevices){
			System.out.println(i);
		}
	}
	public static void getPriceOfElectronicDevices(){
		System.out.println("The pricess electronic Devices:");
		for(double i:priceOfElectronicDevices){
			System.out.println(i);
		}
	}
}












