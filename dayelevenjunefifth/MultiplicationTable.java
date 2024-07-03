package dayelevenjunefifth;

import java.util.Scanner;

class MultiplicationTable {
	static void table(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		table(n);
		sc.close();
	}

}
