package june18prac;

import java.util.Scanner;

class Equilateral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
