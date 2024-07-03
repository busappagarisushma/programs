package com;

import java.util.Scanner;

class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Total Price");
		double price = sc.nextDouble();
		double discPrice= price;
		if(age>=13 && age<=19) {
			discPrice = price - (0.05*price);
			if(discPrice>5000) {
				discPrice = discPrice - (0.05*discPrice);
			}
		} else if (age >=20 && age <=29) {
			discPrice = price - (0.06*price);
			if(discPrice>4000) {
				discPrice = discPrice - (0.06*discPrice);
			}
		} else if (age >29) {
			discPrice = price - (0.15*price);
		} 
		System.out.println("Total price before discount "+price);
		System.out.println("Total price after discount "+discPrice);
		System.out.println("Discounted amount "+(price-discPrice));
	}
}

