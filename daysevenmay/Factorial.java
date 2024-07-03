package daysevenmay;
import java.util.Scanner;
class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Number");
		int n = sc.nextInt();
	
		int fact=1;
		while(n>1) {
			fact*=n;
			n--;
		}
		System.out.println("Factorial is "+fact);
		sc.close();
		
		/** fact=1;
		do {
			fact*=n;
			n--;
		}while(n>1);
		System.out.println("Factorial is "+fact);
		sc.close();*/

	}

}
