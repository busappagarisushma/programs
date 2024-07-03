package daythirteenjuneseventh;

import java.util.Scanner;

class Pronic {
	static boolean isPronic(int n) {
		boolean b=false;
		for(int i=0; i<=n/2; i++) {
			if(n==(i*(i+1))) {
				b=true;
			} 
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isPronic(n);
		if(x)
			System.out.println(n+" is a pronic number.");
		else 
			System.out.println(n+" is not a pronic number.");
		sc.close();
	}

}
