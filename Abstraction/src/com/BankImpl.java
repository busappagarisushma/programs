package com;

class BankImpl implements Bank {

	int balance = 10000;
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance + amount;
		System.out.println("Amount deposited successfully");
	}
	
	@Override
	public void withdraw(int amount) {
		System.out.println("Wihdrawing Rs."+amount);
		balance = balance - amount;
		System.out.println("Amount Withdrawn Successfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance Rs."+balance);
	}

}
