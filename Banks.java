class Banks{
	private int bankId;
	private String bankName;
	private String bankBranch;
	private String branchCode;
	private String address;
	private long helpLineNo;
	private String branchManager;
	private String ifscCode;
	private int miscCode;
	private int noOfLockers;
	private int noOfEmployees;
	private String timings;
	private String websiteDetails;
	
	public void setBankId(int bankId){
		this.bankId=bankId;
	}
	public int getBankId(){
		return bankId;
	}
	
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return bankName;
	}
	
	public void setBankBranch(String bankBranch){
		this.bankBranch=bankBranch;
	}
	public String getBankBranch(){
		return bankBranch;
	}
	
	public void setBranchCode(String branchCode){
		this.branchCode=branchCode;
	}
	public String getBranchCode(){
		return branchCode;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setHelpLineNo(long helpLineNo){
		this.helpLineNo=helpLineNo;
	}
	public long getHelpLineNo(){
		return helpLineNo;
	}
	
	public void setBranchManager(String branchManager){
		this.branchManager=branchManager;
	}
	public String getBranchManager(){
		return branchManager;
	}
	
	public void setIFSCcode(String ifscCode){
		this.ifscCode=ifscCode;
	}
	public String getIFSCcode(){
		return ifscCode;
	}
	
	public void setMISCcode(int miscCode){
		this.miscCode=miscCode;
	}
	public int getMISCcode(){
		return miscCode;
	}
	
	public void setNoOfLockers(int noOfLockers){
		this.noOfLockers=noOfLockers;
	}
	public int getNoOfLockers(){
		return noOfLockers;
	}
	
	public void setNoOfEmployees(int noOfEmployees){
		this.noOfEmployees=noOfEmployees;
	}
	public int getNoOfEmployees(){
		return noOfEmployees;
	}
	
	public void setTimings(String timings){
		this.timings=timings;
	}
	public String getTimings(){
		return timings;
	}
	
	public void setWebsiteDetails(String websiteDetails){
		this.websiteDetails=websiteDetails;
	}
	public String getWebsiteDetails(){
		return websiteDetails;
	}
}