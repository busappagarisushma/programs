package june19prac;

import java.util.Scanner;

class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=n; j>=i; j--) {
				System.out.print("  ");
			}
			for(int j=1; j<(i*2)-2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
