package com;

class Tom extends Person {
	@Override
	void eat() {
		System.out.println("Eating Dosa");
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
	}

}
