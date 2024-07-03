package com;
import java.util.Scanner;

class Program1a {
	public static void main(String[] args) {
		char c1, c2;
		System.out.println("Enter 2 characters");
		Scanner sc = new Scanner(System.in);
		c1 = sc.next().charAt(0);
		c2 = sc.next().charAt(0);
		
		if(c1>c2)
			System.out.println(c1);
		else
			System.out.println(c2);
		
	}

}
