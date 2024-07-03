package daysevenmay;
import java.util.Scanner;
class AvgOfDigit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int count = 0;
		double sum = 0;
		do {
			sum += n%10;
			n = n/10;
			count++;
		} while(n!=0);
		System.out.println("Average "+(sum/count));
		sc.close();
		

	}

}
