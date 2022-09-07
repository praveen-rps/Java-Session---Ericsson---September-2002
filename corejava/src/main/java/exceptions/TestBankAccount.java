package exceptions;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b= new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount = sc.nextInt();
		int balance;
		try {
			balance=b.withDraw(amount);
			System.out.println("Balance after withdraw : "+balance);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e);
		}

	}

}
