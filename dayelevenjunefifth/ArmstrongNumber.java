package dayelevenjunefifth;

import java.util.Scanner;

class ArmstrongNumber {
	static int count(int n) {
		int c =0;
		do {
			c++;
			n/=10;
		} while(n!=0);
		System.out.println("count: "+c);
		return c;

	}
	static boolean getArmstrongNumber(int n) {
		int sum=0, dn=n;
		int c = count(n);
		do {
			int d = n%10;
			int k =1;
			for(int i=1;i<=c;i++) 
				k*=d;
			System.out.println("digit: "+d);
			sum+=k;
			System.out.println("sum: "+sum);
			n/=10;
		} while(n!=0);

		return sum==dn;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = getArmstrongNumber(n);
		if(x) {
			System.out.println(n+" is an Armstrong number");
		} else {
			System.out.println(n+" is not an Armstrong number");
		}
		sc.close();
	}
}
