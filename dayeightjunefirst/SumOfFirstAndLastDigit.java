package dayeightjunefirst;

import java.util.Scanner;

class SumOfFirstAndLastDigit {

	static int sumOfFirstAndLastDigit(int n) {
		int sum = n%10;
		do {
			if(n>=-9 && n<=9) {
				sum +=n;
			}
			n/=10;
		}while(n!=0);
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int res = sumOfFirstAndLastDigit(n);
		System.out.println("Sum of First Digit and Last Digit: "+res);
		
		sc.close();

	}

}
