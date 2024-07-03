package dayeightjunefirst;

import java.util.Scanner;

class ZerosPresentInNumber {
	
	static int getZerosPresentInNumber(int n) {
		
		int count = 0;
		do {
			int ld = n%10;
			if(ld == 0) {
				count ++;
			}
			n/=10;
			
		}while(n!=0);
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int res = getZerosPresentInNumber(n);
		System.out.println("Count of Zeros Present in a Number: "+res);
		
		sc.close();
	}

}
