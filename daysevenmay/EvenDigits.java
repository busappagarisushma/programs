package daysevenmay;
import java.util.Scanner;
class EvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Number");
		int n = sc.nextInt();
		System.out.println("Even Digits in number are:");
		do {
			if((n%10)%2==0) {
				System.out.print(n%10+" ");
			}
			n/=10;
		} while(n!=0);
		sc.close();
		

	}

}
