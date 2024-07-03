package dayeightjunefirst;
import java.util.Scanner;
class Proportion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int n = sc.nextInt();
		int count = 0, evenCount = 0, oddCount=0;
		do {
			int l = n%2;
			if(l%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
			count++;
			n /= 10;

		} while(n!=0);
		double evenResult = (double)(evenCount*100)/count;
		double oddResult = (double)(oddCount*100)/count;
		System.out.println("Even : "+evenResult+"%");
		System.out.println("Odd : "+oddResult+"%");
		

		sc.close();

	}

}
