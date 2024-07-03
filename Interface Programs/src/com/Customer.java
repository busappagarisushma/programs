package com;

class Customer implements Uber {
	@Override
	public void bookCab() {
		System.out.println("Booking cab from Uber");
	}
	
	@Override
	public void payAmount() {
		System.out.println("Paying Amount from PhonePe");
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.bookCab();
		c.payAmount();
		
	}
	
	

}
