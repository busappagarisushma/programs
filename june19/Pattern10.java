package june19;

import java.util.Scanner;

class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*(n-i)+1;j++) {
				System.out.print(j%2+" ");
			}
			
			System.out.println();
		}

	}




}
