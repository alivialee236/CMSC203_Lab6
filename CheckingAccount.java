
public class CheckingAccount extends BankAccount{
	
	//Fields
	private static final double FEE = .15;
	
	//Constructors
	public CheckingAccount(String name, double initialAmount) {
		
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	//Methods
	@Override
	public boolean withdraw(double amount) {
		
		double total = amount + FEE;
		return super.withdraw(total);
		
	}
	
	
}
