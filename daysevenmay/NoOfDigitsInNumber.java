package daysevenmay;
import java.util.Scanner;
class NoOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int n = sc.nextInt();
		int dupn = n;
		int count=0;
		do {
			int l = n%10;
			n= n/10;
			System.out.println(l);
			count++;
		} while(n!=0);
		System.out.println("Number of Digits in "+dupn+" is "+count);
		
		sc.close();

	}

}
