package junetenth;

import java.util.Scanner;

class Automorphic {
	
	static boolean isAutomorphic(int x) {
		int sq = x*x;
		do {
			int d1 = x%10;
			int d2 = x%10;
			if(d1!=d2) 
				return false;
			x= x/10;
			sq = sq/10;
		} while(x!=0 && sq!=0);
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		boolean n = isAutomorphic(x);
		if(n)
			System.out.println(x+" is Automorphic number");
		else
			System.out.println(x+" is not Automorphic number");
		sc.close();
	}

}
