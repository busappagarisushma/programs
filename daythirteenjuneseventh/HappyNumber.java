package daythirteenjuneseventh;

import java.util.Scanner;

class HappyNumber {
	
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isHappy(n);
		if(x)
			System.out.println(n+" is a happy number");
		else
			System.out.println(n+" is not a happy number");
		sc.close();
	}

}
