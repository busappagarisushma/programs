package dayninejunethird;


import java.util.Scanner;

class PrintFactors {
	static void printFactors(int n) {
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Printing the factors of a number");
		printFactors(n);
		sc.close();
	}

}
