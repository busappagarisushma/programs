package june21;

import java.util.Scanner;

class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		int st=n*2-1,sp=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print("* ");
			}
			sp++; 
			st=st-2;
			System.out.println();
		}
		
		
	}

}
