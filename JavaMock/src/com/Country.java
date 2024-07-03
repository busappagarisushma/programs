package com;

class Country {


	Country (String name) {
		System.out.println("Country Name: "+name);
	}
	Country() {
		this("India");
		System.out.println("Country Capital: New Delhi");
	}

	public static void main(String[] args) {


		Country c = new Country();

	}

}
