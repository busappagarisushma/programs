package daythirteenjuneseventh;

import java.util.Scanner;

class HappyPrime {
	
	static boolean isHappy(int n) {
		while(n>9) {
			int sum=0;
			do {
				int d = n%10;
				sum = sum+d*d;
				n=n/10;
			} while(n!=0);
			n=sum;
		}
		return n==7||n==1; 
	}
	
	static boolean isPrime(int n) {
		int c=0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c==0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isPrime(n);
		boolean y = isHappy(n);
		if(x&&y) {
			System.out.println(n+" is a Happy Prime");
		} else {
			System.out.println(n+" is not a Happy Prime");
		}
		sc.close();
	}
	


}
