package june18;

import java.util.Scanner;

class Pattern20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}
