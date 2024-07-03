package dayeightjunefirst;

import java.util.Scanner;

class PrimeDigitsInANumber {

	static int getCountOfPrimeDigitsInANumber(int n) {
		int count=0;
		do {
			int ld = n%10;
			if(ld==2 || ld==3 || ld==5 || ld==7) {
				count++;
			}
			n/=10;
		} while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int result = getCountOfPrimeDigitsInANumber(n);
		System.out.println("Count of prime digits in a number: "+result);
		sc.close();
		

	}

}
