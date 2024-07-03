package daysix;
import java.util.Scanner;
public class FromOneTON {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
		int i =1;
		while(i<=N) {
			System.out.println(i);
			i++;
		}
		sc.close();

	}

}
