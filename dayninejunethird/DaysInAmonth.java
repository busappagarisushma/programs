package dayninejunethird;


import java.util.Scanner;

class DaysInAmonth {
	static String daysInAMonth(int n) {
		if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12) {
			return "31 days";
		} else if(n==4 || n==6 || n==9 || n==11) {
			return "30 days";
		} else if(n==2) {
			return "28 or 29 days";
		} else {
			return "Invalid Number";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

}
