package dayeightjunefirst;

import java.util.Scanner;

class DiffBwSumOfEvenAndOddDigits {

	static int getDiffBwSumOfEvenAndOddDigits(int n) {
		int evenSum = 0;
		int oddSum = 0;
		do {
			int ld=n%10;
			if(ld%2==0) {
				evenSum+=ld;
			} else {
				oddSum+=ld;
			}
			n/=10;
		}while(n!=0);
		
		return evenSum-oddSum;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int n = sc.nextInt();
		int res = getDiffBwSumOfEvenAndOddDigits(n);
		System.out.println("Difference Betweeen Sum of Even digits and Odd digits: "+res);
		sc.close();

	}

}
