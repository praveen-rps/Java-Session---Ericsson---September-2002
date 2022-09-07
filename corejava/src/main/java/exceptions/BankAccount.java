package exceptions;

public class BankAccount {
	int balance;
	BankAccount(){
		balance=10000;
	}
	public int checkBalance(){
		return balance;
	}
	public int withDraw(int amount)throws InsufficientFundsException
	{
		
		    balance = balance-amount;
			if(balance<2000)
				throw new InsufficientFundsException();
			
		
		return balance;
	}

}
