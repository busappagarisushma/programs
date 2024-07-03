package day1;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		sc.close();
		try {
			System.out.println(a/b);
		} 
		catch(ArithmeticException e) {
			System.out.println("Do not divide by Zero");
		}
		System.out.println("end");
	}

}
