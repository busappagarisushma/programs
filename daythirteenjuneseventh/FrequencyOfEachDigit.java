package daythirteenjuneseventh;

import java.util.Scanner;

class FrequencyOfEachDigit {
	static void printFrequencyDigit(int n) {
		int[] ct = new int[10];
		do {
			int d =n%10;
			ct[d]++;
			n=n/10;
		} while(n!=0);
		
		for(int i =0; i<10; i++) {
			if(ct[i]!=0) {
				System.out.println("Number of "+i+"\'s --> "+ct[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		printFrequencyDigit(n);
		sc.close();
	}

}
