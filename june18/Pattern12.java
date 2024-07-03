package june18;

import java.util.Scanner;

class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}
