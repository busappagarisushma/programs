package dayninejunethird;

import java.util.Scanner;

class SumOfFactors {
	static int sumOfFactorsOfANumber(int n) {
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int res = sumOfFactorsOfANumber(n);
		System.out.println("Sum of the Factors of a number "+res);
		sc.close();
	}

}
