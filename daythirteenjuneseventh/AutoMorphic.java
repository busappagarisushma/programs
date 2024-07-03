package daythirteenjuneseventh;

import java.util.Scanner;

class AutoMorphic {
	static boolean isAutoMorphic(int n) {
		int t=n;
		int ncount = count(n);
		int sq = n*n;
		int value=0,c=0;
		do {
			value = value*10 + sq%10;
			sq/=10;
			c++;
			if(c==ncount)
				break;
		} while(true);
		return t==reverse(value);
		
	}
	
	static int count(int n) {
		int c=0;
		do {
			c++;
			n/=10;
		}while(n!=0);
		return c;
	}
	static int reverse(int n) {
		int rev = 0;
		do {
			rev = rev*10+n%10;
			n/=10;
		} while(n!=0);
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isAutoMorphic(n);
		if(x) 
			System.out.println(n+" is a automorphic number.");
		else 
			System.out.println(n+" is not a automorphic number.");
		sc.close();
	}
	

}
