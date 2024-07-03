package daytwelevejunesixth;

import java.util.Scanner;

class EvenOrOdd {
	static String getEvenOrOdd(int n) {
		int evenCount=0, oddCount=0;
		do {
			int d =n%10;
			if(d%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
			n/=10;
		} while(n!=0);
		
		if(evenCount>oddCount) {
			return "Even Dominate number";
		} else if(oddCount>evenCount) {
			return "Odd Dominate number";
		} else {
			return "Equally distributed number";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String x = getEvenOrOdd(n);
		System.out.println(n+" is a "+x);
		sc.close();
	}

}
