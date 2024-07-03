package daytwelevejunesixth;

import java.util.Scanner;

class PrintReverse {
	
	static int reverse(int n) {
		int rev=0;
		do {
			rev = rev*10 + n%10;
			n=n/10;
		} while(n!=0);
		return rev;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = reverse(n);
		System.out.println("Reverse of "+n+" is "+x);
		sc.close();
	}

}
