package dayninejunethird;

import java.util.Scanner;

class PrimeNumberOrNot {
	static boolean primeNumber(int n) {
		int count =1;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = primeNumber(n);
		if(x==true) {
			System.out.println(n+" is a prime number");
		} else {
			System.out.println(n+" is not a prime number");
		}
		sc.close();
	}

}
