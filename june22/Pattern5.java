package june22;

import java.util.Scanner;

class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			
			
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || j==n || i==n || i==j || i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			
			System.out.println();
		}
	}
}
