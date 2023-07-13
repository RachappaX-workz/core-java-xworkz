class BoatHeadPhones {
	static boolean isHeadPhonesOn;
	static int minVolume;
	static int currentVolume;
	static int maxVolume=30;
	public static boolean onOrOff(){
		if(isHeadPhonesOn==false){
			isHeadPhonesOn=true;
			System.out.println("HeadPhone is now on..");
		}
		else if(isHeadPhonesOn==true){
			isHeadPhonesOn=false;
		}
		return isHeadPhonesOn;
	}

	//increase volume
	public static void increaseVolume(){
		if(isHeadPhonesOn==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume + 1;
				System.out.println("The cureent volume is.."+currentVolume);
			}else {
				System.out.println("Maximum volume reached");
			}
		}else{
			System.out.println("The HeadPhone is off..plz do onn....");
		}
	}
	
	
	public static void decreaseVolume(){
		if(isHeadPhonesOn==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume - 1;
				System.out.println("The cureent volume is.."+currentVolume);
			}else{
				System.out.println("Maximum volume reached");
			}
		}else{
			System.out.println("The HeadPhone is off..plz do onn....");
		}
	}
}

