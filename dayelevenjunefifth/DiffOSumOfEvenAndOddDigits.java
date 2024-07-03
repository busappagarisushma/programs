package dayelevenjunefifth;

import java.util.Scanner;

class DiffOSumOfEvenAndOddDigits {
	static int getDiffOSumOfEvenAndOddDigits(int n) {
		int evenSum=0, oddSum=0;
		do {
			int d = n%10;
			if(d%2==0) {
				evenSum += d;
			} else {
				oddSum += d;
			}
			n/=10;
		} while(n!=0);
		return evenSum-oddSum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = getDiffOSumOfEvenAndOddDigits(n);
		System.out.println("Difference Between sum of even digits and odd digits is: "+x);
		sc.close();
	}

}
