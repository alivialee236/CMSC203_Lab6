
public class SavingsAccount extends BankAccount {
	
	//Fields
	public static double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	//Constructors
	public SavingsAccount(String name, double initialBalance) {
		
		super (name, initialBalance);
		
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;

	}
	
	public SavingsAccount(SavingsAccount otherAccount, double initialBalance) {
		
		super(otherAccount, initialBalance);
		
		savingsNumber = otherAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
		
	}
	
	//Methods
	
	public void postInterest() {
		
		double interest = (getBalance() * rate ) / 12;
		deposit (interest);
		
	}
	
	@Override
	public String getAccountNumber() {
		
		return (accountNumber);
		
	}
	

}
