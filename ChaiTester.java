class ChairTester {
	public static void main(String args[]){
		//Object creation in java..
		//ClassName referenceVariable=new ClassName();
		System.out.println("Creating 1stcopy of the class-Chair");
		Chair chair=new Chair();
		chair.name="Nirmala";
		chair.type="Plastic";
		chair.color="Cream";
		chair.price=300.00;
		System.out.println(chair.name+ " "+chair.type+" "+);
		
		System.out.println("Creating 1stcopy of the class-Chair")
		Chair chair1=new Chair();
		chair1.name="Nirmala";
		chair1.typr="steel";
		chair1.color="black";
		chair1.price=670.00;
		chair1.toSit();
		
		Chair chair2=new Chair();
	}
}