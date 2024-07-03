 package daythirteenjuneseventh;

import java.util.Scanner;

class Emirp {
	static boolean isEmirp(int n) {
		int rev=0;
		if(isPrime(n)) {
			
			do {
				rev = rev*10+n%10;
				n/=10;
			} while(n!=0);	
		}
		return isPrime(rev);
	}
	static boolean isPrime(int n) {
		int count=0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isEmirp(n);
		if(x) 
			System.out.println(n+ " is a emirp number.");
		else 
			System.out.println(n+" is not a emirp number.");
		sc.close();
	}

}
