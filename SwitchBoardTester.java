class SwitchBoardTester {
	public static void main(String args[]){
		//new - it'll allocate memory for the perticular object..
		//Object creation logic
		//allocate a memory
		//Invoke constuctor of class
		//ref variable
		SwitchBoard board=new SwitchBoard();
		System.out.println(board);         //The referenece variable holds the address of the perticular variable..
		
		//before initializing the value for the referenece variables are default..
		System.out.println(board.brandName);
		System.out.println(board.noOfSwitches);
		System.out.println(board.color);
		System.out.println(board.type);
		System.out.println(board.price);
		
		board.brandName="JK";
		board.noOfSwitches=3;
		board.type="wooden";
		board.color="Brown";
		board.price=100.00;
		System.out.println(board.brandName);
		board.provideElectricity();
	}
}


//Object creation will happen during Run-time..