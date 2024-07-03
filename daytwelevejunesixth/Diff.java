package daytwelevejunesixth;

import java.util.Scanner;

class Diff {
	
	static int getDiff(int n) {
		int l=n%10, f=0;
		do {
			if(n>=-9 && n<=9)
				f=n;
			// Or f = n%10;
			n=n/10;
		} while(n!=0);
		
		if(f>l)
			return f-l;
		else 
			return l-f;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = getDiff(n);
		System.out.println("The difference is "+x);
		sc.close();
	}

}
