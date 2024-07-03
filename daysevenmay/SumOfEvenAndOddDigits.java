package daysevenmay;
import java.util.Scanner;
class SumOfEvenAndOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int n = sc.nextInt();
		int evenSum=0, oddSum=0;
		do {
			if((n%10)%2==0) {
				evenSum+=n%10;
			} else {
				oddSum+=n%10;
			}
			n=n/10;
		} while(n!=0);
		
		System.out.println("Even Sum: "+evenSum+" Odd Sum: "+oddSum);
		sc.close();
	


	}

}
