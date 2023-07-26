class SwitchBoard{
	//Constructor - it is a special type of method which doesn't have return type..
	//We can also Create a constructor for a class..
	//If we don't create the constructor defaultly java Compiler will create a constructor for a perticular class..To check that use commad -javap ClassName
	public SwitchBoard(){
		System.out.println("Switchboard constructor is invoked");
	}
	String brandName;
	int noOfSwitches;
	String type;
	String color;
	double price;
	
	public void provideElectricity(){
		System.out.println("Supplying Power..");
	}
}