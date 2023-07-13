/*class Telecom{
	static String sims[]={null,null,null,null,null};
	static int i;
	public static void getAllSims(){
		for(String j:sims){
			String ref=j;
			System.out.println(ref);
		}
	}
	public static boolean addSim(String sim){
		boolean isAdded=false;
		if(sim!=null){
			sims[i]=sim;
			i++;
			isAdded=true;
		}else{
			System.out.println("Cann't add sims..As it's null value..");
		}
		return isAdded;
	}
	public static void main(String args[]){
		addSim("Airtel");
		addSim("Idea");
		addSim("Docomo");
		addSim("Jio");
		addSim("BSNL");
		getAllSims();
	}
}*/


class Telecom{
	static String sims[]={null,null,null,null,null};
	static int i;
	public static void getAllSims(){
		for(String j:sims){
			String ref=j;
			System.out.println(ref);
		}
	}
	public static boolean addSim(String sim){
		boolean isAdded=false;
		if(sim!=null){
			sims[i]=sim;
			i++;
			isAdded=true;
		}else{
			System.out.println("Cann't add sims..As it's null value..");
		}
		return isAdded;
	}
	public static boolean updateSimName(String existingSimName,String updatingSimName){
		boolean isUpdated=false;
		for(int i=0;i<sims.length;i++){
			if(sims[i]==existingSimName){
				sims[i]=updatingSimName;
			}
		}
		return isUpdated;
	}
	public static boolean searchSimsByName(String simName){
		boolean isSearched=false;
		for(String simNames:sims){
			if(simNames==simName){
				isSearched=true;
				System.out.println("The sim "+simName+" found");
			}
		}
		return isSearched;
	}
	public static void main(String args[]){
		addSim("Airtel");
		addSim("Idea");
		addSim("Docomo");
		addSim("Jio");
		addSim("BSNL");
		updateSimName("Idea","Vodafone Idea");
		getAllSims();
		searchSimsByName("Docomo");
	}
}