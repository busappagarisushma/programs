package com;

class BankMainClass {

	public static void main(String[] args) {
		Bank b = new BankImpl();
		b.deposit(3000);
		b.checkBalance();
		System.out.println("----");
		b.withdraw(4000);
		b.checkBalance();
		
	}
}
