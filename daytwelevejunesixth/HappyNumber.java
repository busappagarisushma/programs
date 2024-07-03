package daytwelevejunesixth;

import java.util.Scanner;

class HappyNumber {
	static boolean getHappyNumber(int n) {
		boolean s = false;
		while(true) {
			int x = happy(n);
			System.out.println(x);
			if(x==1 ||x==7) {
				s = true;
				break;
			} else if (x<=9) {
				s = false;
				break;
			}
			n=x;
			
		}
		return s;
	}
	static int happy(int n) {
		int sum=0;
		do {
			int d=n%10;
			sum += (d*d);
			n=n/10;
		} while(n!=0);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x=getHappyNumber(n);
		if(x) {
			System.out.println(n+" is a happy number");
		} else {
			System.out.println(n+" is not a happy number");
		}
		sc.close();
	}
	

}
