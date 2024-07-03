package dayninejunethird;

import java.util.Scanner;

class ArmstrongNumber {
	static boolean getArmstrongNumber(int n) {
		int value = 0;
		int dn=n;
		
		for(;n!=0;n/=10) {
			int d=n%10;
			value += (d*d*d);
			
		}
		return dn==value;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean res = getArmstrongNumber(n);
		if(res==true) {
			System.out.println(n+" is an Armstrong number");
		} else {
			System.out.println(n+" is not an Armstrong number");
		}
		sc.close();
	}

}
