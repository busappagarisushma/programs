package june22;

import java.util.Scanner;

class Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		int sp=n/2+2,st=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=st; j++) {
				if(j==1 || j==st || i==n) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			sp--;
			st=st+2;
			System.out.println();
		}
	}

}
