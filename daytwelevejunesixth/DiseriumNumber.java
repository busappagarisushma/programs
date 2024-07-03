package daytwelevejunesixth;

import java.util.Scanner;

class DiseriumNumber {
	static boolean getDiserium(int n) {
		int sum=0,t=n;
		int ct=(n+"").length();
		do {
			int d = n%10;
			sum = sum+(int)Math.pow(d, ct);
			ct--;
			n=n/10;
		} while(n!=0);
		return sum==t;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = getDiserium(n);
		if(x) {
			System.out.println(n+" is a diserium number");
		} else {
			System.out.println(n+" is not a diserium number");
		}
		sc.close();
	}

}
