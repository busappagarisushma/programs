package dayelevenjunefifth;

import java.util.Scanner;

class StrongNumber {
	static boolean getStrongNumber(int n) {
		int sum =0,temp=n;
		do {
			int fact=1;
			int d = n%10;
			for(int i=1; i<=d; i++) {
				fact= fact*i;
			} 
			sum+=fact;
			n/=10;
		} while(n!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		boolean x = getStrongNumber(n);
		if(x==true) {
			System.out.println(n+" is a strong number");
		} else {
			System.out.println(n+" is not a strong number");
		}
		sc.close();
	}

}
