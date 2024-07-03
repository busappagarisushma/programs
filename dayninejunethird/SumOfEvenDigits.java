package dayninejunethird;

import java.util.Scanner;

class SumOfEvenDigits {
	static int SumOfEvenDigitsInANumber(int n) {
		int sum = 0 ;
		do {
			int d = n%10;
			if(d%2==0) {
				sum+=d;
			}
			n/=10;
		} while(n!=0);
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value ");
		int n = sc.nextInt();
		int result = SumOfEvenDigitsInANumber(n);
		System.out.println("Sum of the even digits in a number is "+result);
		sc.close();
	}
	

}
