package june17;

import java.util.Scanner;

class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		int d=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(d+" ");
				if(d==1) {
					d=0;
				} else  {
					d=1;
				}
				
			}
			System.out.println();
			d=1;
		}
	}

}
