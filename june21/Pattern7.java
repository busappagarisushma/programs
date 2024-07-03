package june21;

import java.util.Scanner;

class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		int sp=n/2,st=1;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1; j<=st; j++) {
				System.out.print(x+" ");
				
			}
			
		}
	}

}
