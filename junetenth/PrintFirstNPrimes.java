package junetenth;

import java.util.Scanner;

class PrintFirstNPrimes {

	static void printNPrimes(int n) {
		System.out.println("Printing first N primes");
		for(int i=2; n>0; i++)  {
			int c=0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0) {
					c++;
				}	
			}
			if(c==1) {
				System.out.print(i+" ");
				n--;
			}
				
			

		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		printNPrimes(n);
		sc.close();
	}


}
