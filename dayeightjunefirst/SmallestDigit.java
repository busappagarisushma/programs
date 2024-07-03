package dayeightjunefirst;
import java.util.Scanner;
class SmallestDigit {
	
	static int getSmallestDigit(int n) {
		
		int small = 9;
		do {
			int ld = n%10;
			if(ld<small) {
				small = ld;
			}
			n/=10;
		}while(n!=0);
		
		return small;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int n = sc.nextInt();
		int r = getSmallestDigit(n);
		System.out.println("Smallest digit is: "+r);
		sc.close();

	}

}
