 package june20assignment;

import java.util.Scanner;

class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		sc.close();

		for(int i=1;i<=n;i++) {
			int x=i,temp=n-1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x=x+temp;
				temp--;
			}
			System.out.println();
		}
	}
}
