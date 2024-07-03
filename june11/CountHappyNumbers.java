package june11;

import java.util.Scanner;

class CountHappyNumbers {

	static boolean isHappy(int n) {

		while(n>9) {
			int sum=0;
			do {
				int d = n%10;
				sum = sum +(d*d);
				n=n/10;
			} while(n!=0);
			n=sum;
		}
		return n==1 || n==7;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count=0;
		for(int i=1; i<=n; i++) {
			if(isHappy(i))
				count++;
		}
		System.out.println("There are "+count+" numbers within "+n);
		sc.close();
	}

}
