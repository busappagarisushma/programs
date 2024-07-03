package daythirteenjuneseventh;

import java.util.Scanner;

class Xylem {
	
	static String isXylem(int n) {
		int last=n%10, mid = 0;
		n/=10;
		do {
			int d = n%10;
			mid = mid + d;
			n/=10;  
		}while(n>9 || n<-9);
		last = last + n; 
		if(last== mid) 
			return "Xylem";
		else 
			return "Pholem";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String s = isXylem(n);
		System.out.println(n+" is a "+s+" number.");
		sc.close();
	}

}
