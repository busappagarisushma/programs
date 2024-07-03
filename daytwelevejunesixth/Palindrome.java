package daytwelevejunesixth;

import java.util.Scanner;

class Palindrome  {
	static boolean getPalindrome(int n) {
		int rev =0, t=n;
		do {
			rev = rev*10+n%10;
			n=n/10;
		} while(n!=0);
		return rev==t;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();    
		boolean x = getPalindrome(n);
		if(x) {
			System.out.println(n+" is a palindrome");
		} else {
			System.out.println(n+" is not a palindrome");
		}
		sc.close();
	}

}
