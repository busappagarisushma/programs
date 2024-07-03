package june11;

import java.util.Scanner;

class StrongNumber {
	static boolean isStrong(int n) {
		int sum=0,temp=n;
		do {
			int fact = 1;
			int d=n%10;
			
			for(int i=1; i<=d; i++) {
				fact = fact*i;
			}
			sum += fact;
			n/=10;
		} while(n!=0);
		
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Strong numbers");
		for(int i=1; n>0; i++) {
			if(isStrong(i)) {
				System.out.print(i+" ");
				n--;
			}
		}
		
		
		sc.close();
		
	}

}
