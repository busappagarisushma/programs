package com;

class Vehicle {
	String brand = "Suzuki";
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Driving Car");
	}
}

class Bike extends Vehicle {
	void ride() {
		System.out.println("Riding Bike");
	}
}
