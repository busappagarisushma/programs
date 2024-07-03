package dayeightjunefirst;
import java.util.Scanner;
class DiffBwBigSmall {
	
	static int diffbwBigAndSmall(int n) {
		int big = -9;
		int small = 9;
		do {
			int ld = n%10;
			if(ld>big) {
				big = ld;
			}
			if(ld<small) {
				small = ld;
			}
			n/=10;
		} while(n!=0);
		
		return big-small;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer Value");
		int n = sc.nextInt();
		int result = diffbwBigAndSmall(n);
		System.out.println("Difference between Biggest Digit and Smallest Digit: "+result);
		
		sc.close();
		

	}

}
