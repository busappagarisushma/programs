package junetenth;

import java.util.Scanner;

class CountPrimes {
	static int getCountOfPrimes(int n) {
		int count=0;
		for(int i=2; i<=n; i++) {
			int c=0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0)
					c++;
			}
			if(c==1)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = getCountOfPrimes(n);
		System.out.println(n+ " has "+x+" primes");
		sc.close();
	}

}
