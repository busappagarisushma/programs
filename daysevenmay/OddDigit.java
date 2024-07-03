package daysevenmay;
import java.util.Scanner;
class OddDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		do {
			if((n%10)%2==1) {
				System.out.print(n%10+" ");
			}
			n/=10;
		} while(n!=10);
		sc.close();

	}

}
