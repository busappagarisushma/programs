package june19;

import java.util.Scanner;

class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print(j%2+" ");
			}
			
			System.out.println();
		}

	}


}
