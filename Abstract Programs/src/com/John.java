package com;

class John extends Employee{

	@Override
	void work() {
		System.out.println("Working @ Amazon");
	}

	@Override
	void study() {
		System.out.println("Studying java");
	}

	public static void main(String[] args) {
		John j = new John();
		j.work();
		j.study();
	}

}
