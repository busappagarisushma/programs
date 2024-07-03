package daysix;
import java.util.Scanner;
public class FromNtoOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
		while(N>0) {
			System.out.println(N);
			N--;
		}
		sc.close();
		
	}

}
