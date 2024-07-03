package daytwelevejunesixth;

import java.util.Scanner;

class Armstrong {
	static boolean isArmstrong(int n) {
		int sum = 0,temp=n;
		int c = countDigits(n);
		do {
			int d = n%10;
			sum = sum+getPower(d,c);
			n=n/10;
		} while(n!=0);
		return temp==sum;
	}
	static int getPower(int n,int p) {
		int prod = 1;
		while(p>0) {
			prod = prod*n;
			p--;
		}
		return prod;
	}
	
	static int countDigits(int n) {
		int count = 0;
		do {
			count++;
			n=n/10;
		} while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean x = isArmstrong(n);
		if(x) {
			System.out.println(n+" is an Armstrong number");
		} else {
			System.out.println(n+" is not an Armstrong number");
		}
		sc.close();
	}

}
