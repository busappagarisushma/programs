package com;
import java.util.Scanner;
/**
 * Find Largest Number
 * 
 * steps:
 * 1. create two variables
 * 2. read data using Scanner
 * 3. logic to findest largest
 * 
 */
class Program1 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2) 
			System.out.println("Largest is "+num1);
		else 
			System.out.println("Largest is "+num2);
		sc.close();
		
	}
	
	

}

