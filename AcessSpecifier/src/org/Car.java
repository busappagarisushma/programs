package org;

import com.Vehicle;

//Accessing protected members
//in different package

class Car extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c =new Car();
		System.out.println("brand: "+c.brand);
		System.out.println("Price: "+c.price);
		
		

	}

}
