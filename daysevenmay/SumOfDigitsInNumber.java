package daysevenmay;
import java.util.Scanner;
class SumOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int sum=0;
		do {
			sum += n%10;
			n = n/10;
		}while(n!=0);
		System.out.println("Sum is: "+sum);
		sc.close();

	}

}
