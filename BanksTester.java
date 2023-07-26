class BanksTester{
	public static void main(String args[]){
		Banks bank=new Banks();
		bank.setBankId(1);
		bank.setBankName("SBI");
		bank.setBankBranch("SBI Bangalore");
		bank.setBranchCode("B16234");
		bank.setAddress("Post bag No.5310,ST.Marks road,Bangalore,560001");
		bank.setHelpLineNo(8022214749l);
		bank.setBranchManager("Ashok S");
		bank.setIFSCcode("SBIN0000813");
		bank.setMISCcode(560002057);
		bank.setNoOfLockers(2000);
		bank.setNoOfEmployees(25);
		bank.setTimings("10AM-5PM");
		bank.setWebsiteDetails("www.statebankofindia.in");
		
		System.out.println(bank.getBankId()+"\n"+bank.getBankName()+"\n"+bank.getBankBranch()+"\n"+bank.getBranchCode()+"\n"+bank.getAddress()+"\n"+bank.getHelpLineNo()+"\n"+bank.getBranchManager()+"\n"+bank.getIFSCcode()+"\n"+bank.getMISCcode()+"\n"+bank.getNoOfLockers()+"\n"+bank.getNoOfEmployees()+"\n"+bank.getTimings()+"\n"+bank.getWebsiteDetails());
		System.out.println("-----------------");
	}
}