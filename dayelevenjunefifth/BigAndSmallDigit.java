package dayelevenjunefifth;

import java.util.Scanner;

class BigAndSmallDigit {
	static int getSumofBigAndSmallDigit(int n) {
		int small=9, big=-9;
		do {
			int d = n%10;
			if(d>big) {
				big = d;
			}
			if(d<small) {
				small=d;
			}
			n/=10;
		} while(n!=0);
		return small+big;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = getSumofBigAndSmallDigit(n);
		System.out.println("Sum of Biggest and Smallest digit in a number: "+x);
		sc.close();
	}

}
