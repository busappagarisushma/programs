package june19;

import java.util.Scanner;

class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=n; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}




}
