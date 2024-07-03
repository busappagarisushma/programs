package june22;

import java.util.Scanner;

class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			if(i==1 || i==n) 
				System.out.print("* ");
			else 
				System.out.print("_ ");
		}
		
		
	}

}
