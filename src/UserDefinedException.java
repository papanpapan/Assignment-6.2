
public class UserDefinedException {
	public static void main(String args[])throws NotSufficientFundException{
		BankAtm atm=new BankAtm();
	System.out.println("Current balance : " + atm.balance()); 
	System.out.println("Withdrawing $2000"); 
	atm.withdraw(2000); 
	System.out.println("Current balance : " + atm.balance()); 
	atm.withdraw(10000);
	}
	

	
}
