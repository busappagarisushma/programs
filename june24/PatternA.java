package june24;

import java.util.Scanner;

class PatternA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i>=n/2+1 && j==1) || (i>=n/2+1 && j==n)  || i==n/2+1 || (j==n/2+1 && i==1) ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
