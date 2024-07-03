package daytwelevejunesixth;

import java.util.Scanner;

class FrequencyOfEachDigit {

	static void getFrequency(int n) {
		int zero=0, one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0;
		do {
			int d = n%10;
			if(d==0) {
				zero++;
			} else if(d==1) {
				one++;
			} else if(d==2) {
				two++;
			} else if(d==3) {
				three++;
			} else if(d==4) {
				four++;
			} else if(d==5) {
				five++;
			} else if(d==6) {
				six++;
			} else if(d==7) {
				seven++;
			} else if(d==8) {
				eight++;
			} else if(d==9) {
				nine++;
			} 
			n/=10;
		} while(n!=0);
		System.out.println("Frequency of Digits");
		System.out.println("Zero\'s: "+zero);
		System.out.println("One\'s: "+one);
		System.out.println("Two\'s: "+two);
		System.out.println("Three\'s: "+three);
		System.out.println("Four\'s: "+four);
		System.out.println("Five\'s: "+five);
		System.out.println("Six\'s: "+six);
		System.out.println("Seven\'s: "+seven);
		System.out.println("Eight\'s: "+eight);
		System.out.println("Nine\'s: "+nine);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		getFrequency(n);
		sc.close();
	}

}