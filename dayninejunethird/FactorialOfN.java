package dayninejunethird;

import java.util.Scanner;

class FactorialOfN {
	static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *=i;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N value");
	int n = sc.nextInt();
	int rs = factorial(n);
	System.out.println("The Factorial of N is "+rs);
	
	sc.close();
	
}
}
