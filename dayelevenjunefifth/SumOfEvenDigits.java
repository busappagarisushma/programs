package dayelevenjunefifth;

import java.util.Scanner;

class SumOfEvenDigits {
	static int getSumOfEvenDigits(int n) {
		int sum = 0;
		do {
			int d = n%10;
			if(d%2==0) {
				sum += (d*d);
			}
			n/=10;
		} while(n!=0);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = getSumOfEvenDigits(n);
		System.out.println("sum of Square of Even Digits: "+x);
		sc.close();
	}

}
