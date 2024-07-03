package dayelevenjunefifth;

import java.util.Scanner;

class NpowerP {
	static int getNpowerP(int n,int p) {
		int res = 1;
		do {
			res *= n;
			p--;
		} while(p>0);
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		System.out.println("Enter the power ");
		int p = sc.nextInt();
		int x = getNpowerP(n,p);
		System.out.println("Result of N power P "+x);
		sc.close();
	}

}
