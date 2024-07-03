package june11;

import java.util.Scanner;

class FirstNArmstrong {
	
	static boolean isArmstrong(int n) {
		int sum=0,t=n;
		int ct = (n+"").length();
		do {
			int d = n%10;
			sum = sum +(int)Math.pow(d,ct);
			n=n/10;
		} while(n!=0);
		return sum==t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=1; n>0; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+" ");
				n--;
			}
		}
		sc.close();
	}
	
	

}
