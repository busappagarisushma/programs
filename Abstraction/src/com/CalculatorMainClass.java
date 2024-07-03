package com;

class CalculatorMainClass{
	public static void main(String[] args) {
		//Upcasting - rule 4
		Calculator c = new CalculatorImpl();
		c.add(4, 5);
		c.mul(4, 5);
	}

}
  