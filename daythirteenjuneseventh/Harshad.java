package daythirteenjuneseventh;

import java.util.Scanner;

class Harshad {
	static boolean isHarshad(int n) {
		int sum=0, t=n;
		do {
			int d = n%10;
			sum +=d;
			n/=10;
		} while(n!=0);
		
		if(t%sum==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isHarshad(n);
		if(x)
			System.out.println(n+" is a Harshad or Niven number.");
		else 
			System.out.println(n+" is not a Harshad or Niven number.");

		sc.close();
		
	}

}
