package com;

class BillPayment {
	
	void Payment(int cash) {
		System.out.println("Cash: "+cash);
	}
	void payment(String upi) {
		System.out.println("Payment done by UPI: "+upi);
	}
	void payment(double amount) {
		System.out.println("Payment done using PhonePay"+amount);
	}

	public static void main(String[] args) {
		BillPayment b = new BillPayment();
		b.payment(2000);
		b.payment("hd8934jc");
		b.payment(3255.10);
	}

}
