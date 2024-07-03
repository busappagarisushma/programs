package daysix;
import java.util.Scanner;
public class NTimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter N value");
		int n = sc.nextInt();
		System.out.println("Printig your name N times");
		while(n>=1) {
			System.out.println(name);
			n--;
		}
		
		sc.close();
	}
}
