package june20assignment;

import java.util.Scanner;

class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1; j<=i*2-1; j++) {
				System.out.print((char)(x+64)+" ");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}


}
