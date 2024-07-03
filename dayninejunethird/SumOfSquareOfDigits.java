package dayninejunethird;

import java.util.Scanner;

class SumOfSquareOfDigits {
	static int sumOfSquare(int n) {
		int sum = 0;
		for(;n!=0;n/=10) {
			int d = n%10;
			sum += (d*d);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int res = sumOfSquare(n);
		System.out.println("Sum of square of digits of a number "+res);
		sc.close();
		
	}

}
