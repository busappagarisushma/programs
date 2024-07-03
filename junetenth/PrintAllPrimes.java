package junetenth;

import java.util.Scanner;

class PrintAllPrimes {
	static void getPrimes(int n) {
		System.out.println("Prime numbers within "+n);
		for(int i=2; i<=n; i++) {
			int c=0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0) {
					c++;
				}	
			}
			if(c==1) 
				System.out.print(i+" ");
				
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		getPrimes(n);
		sc.close();
	}

}
