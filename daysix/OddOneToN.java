package daysix;
import java.util.Scanner;
public class OddOneToN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		System.out.println("Odd Numbers");
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i+=2;
		}
		sc.close();
		

	}

}
