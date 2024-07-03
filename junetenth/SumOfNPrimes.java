package junetenth;

import java.util.Scanner;

class SumOfNPrimes {
	
	static int sumOfNPrimes(int n) {
		int sum=0;
		for(int i=2; n>0; i++) {
			int c=0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0)
					c++;
			}
			if(c==1) {
				sum+=i;
				n--;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = sumOfNPrimes(n);
		System.out.println("Sum of "+n+" Primes is "+x);
		sc.close();
	}

}
