package june20assignment;

import java.util.Scanner;

class Pattern2 {
	static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}

			for(int j=0; j<=i; j++) {


				System.out.print(" "+factorial(i)/(factorial(i-j)*factorial(j)));	
			}
			System.out.println();
		}

	}
}