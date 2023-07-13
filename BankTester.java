class BankTester{
	public static void main(String args[]){
		BankAccount.credit(200);
	    BankAccount.debit(100);
		BankAccount.debit(200);
		BankAccount.credit(0);
		//double balance=BankAccount.getBalance();
		//System.out.println("Balance : "+balance);
		BankAccount.getBalance();
	}
}

/* variable/Identifiers/Literals/Keywords,Datatype,Methods,Arrays,Conditional,looping statements - for,Operators,variables & datatypes