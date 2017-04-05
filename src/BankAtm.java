
public class BankAtm {
	private int balance = 10000; 
	public int balance() 
	{
	 return balance; 
	 } 
	public void withdraw(int amount) throws NotSufficientFundException { 
	if (amount > balance) { 
	throw new NotSufficientFundException("Not Sufficient balance", null);
	} 
	balance = balance - amount; 
	} 
	public void deposit(int amount) { 
	if (amount <= 0) { 
	throw new IllegalArgumentException();
	} 
	} 
	}

