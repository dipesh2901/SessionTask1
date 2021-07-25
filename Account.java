package com.neosoft.programs;

public class Account {
	
	private int acc_balance=0;
	
	public Account(int amount) {
		acc_balance=amount;
	}
	
	public void withdraw(int withdraw_amount) {
		try {
			if(withdraw_amount>acc_balance) {
				throw new WithdrawException("Insufficent Balance in your account!");
			}
			else {
				acc_balance=acc_balance-withdraw_amount;
				System.out.println("Successfully Witdrawn!!");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void showBalance() {
		System.out.println("Your current Balance: "+acc_balance);
	}

	public static void main(String[] args) {
		// User Defined Exception Task
		Account ac=new Account(25000);
		ac.withdraw(30000);
		ac.showBalance();
		ac.withdraw(20000);
		ac.showBalance();

	}

}
