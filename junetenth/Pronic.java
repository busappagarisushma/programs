package junetenth;

import java.util.Scanner;

class Pronic {
	
	static boolean pronic(int n) {
		for(int i=0; i*(i+1) <= n; i++) {
			if(n==i*(i+1)) 
				return true;
		}
		return false;
	}
	
	static boolean isPronic(int n) {
		int sq = (int)Math.sqrt(n);
		if(n==sq*(sq+1))
			return true;
		else
			return false;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = pronic(n);
		if(x)
			System.out.println(n+" is a pronic number");
		else 
			System.out.println(n+" is not a pronic number");
		sc.close();
	}
}
