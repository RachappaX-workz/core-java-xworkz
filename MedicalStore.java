/*class MedicalStore{
	static String medicineNames[]={null,null,null,null,null,null,null,null,null};
	public static void getAllMedicines(){
		for(String o:medicineNames){
			String ref=o;
			System.out.println(ref+" is added..");
		}
	}
	static int i=0;
	public static boolean addMedicineName(String medicine){
		boolean isAdded=false;
		if(medicine!=null){
			medicineNames[i++]=medicine;
			isAdded=true;
		}else{
			System.out.println("Cann't be added..As it is null..");
		}
		return isAdded;
	}
	public static void main(String args[]){
		addMedicineName("Azithromycin");
		addMedicineName("Dolo-650");
		addMedicineName("Aspirin");
		addMedicineName("Metronidazole");
		addMedicineName("Atenolol");
		addMedicineName("Metformin");
		addMedicineName("Phenytoin");
		addMedicineName("Aciclovir");
		addMedicineName("Acitaminophen");
		updateMedicineName("Azithromycin","Azithromycin 500mg");
		getAllMedicines();
	}
}*/

class MedicalStore{
	static String medicineNames[]={null,null,null,null,null,null,null,null,null};
	public static void getAllMedicines(){
		for(String o:medicineNames){
			String ref=o;
			System.out.println(ref+" is added..");
		}
	}
	static int i=0;
	public static boolean addMedicineName(String medicine){
		boolean isAdded=false;
		if(medicine!=null){
			medicineNames[i++]=medicine;
			isAdded=true;
		}else{
			System.out.println("Cann't be added..As it is null..");
		}
		return isAdded;
	}
	public static boolean updateMedicineName(String existingMedicineName,String newMedicineName){
		boolean isUpdated=false;
		for(int i=0;i<medicineNames.length;i++){
			if(medicineNames[i]==existingMedicineName){
				medicineNames[i]=newMedicineName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static boolean deleteMedicine(String medicine){
		boolean isDeleted=false;
		int i;
		for(i=0;i<medicineNames.length;i++){
			if(medicineNames[i]==medicine)
				break;
		}
		int noOfElements=medicineNames.length;
		System.out.println(noOfElements);
		if(i<noOfElements){
			noOfElements=noOfElements-1;
		for(int j=i;j<noOfElements;j++){
			medicineNames[j]=medicineNames[j+1];
		}
		}
		System.out.println(noOfElements);
		return isDeleted;
	}
	public static String searchByMedicine(String medicineName){
		for(int i=0;i<medicineNames.length;i++){
			if(medicineNames[i]==medicineName)
				System.out.println(medicineName+" found");
		}
		return medicineName;
	}
	public static void main(String args[]){
		addMedicineName("Azithromycin");
		addMedicineName("Dolo-650");
		addMedicineName("Aspirin");
		addMedicineName("Metronidazole");
		addMedicineName("Atenolol");
		addMedicineName("Metformin");
		addMedicineName("Phenytoin");
		addMedicineName("Aciclovir");
		addMedicineName("Acitaminophen");
		updateMedicineName("Azithromycin","Azithromycin 500mg");
		getAllMedicines();
		searchByMedicine("Metformin");
		searchByMedicine("Dolo-650");
		//deleteMedicine("Metformin");
		//getAllMedicines();
	}
}