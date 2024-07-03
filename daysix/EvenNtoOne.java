package daysix;
import java.util.Scanner;
public class EvenNtoOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		if(n%2==1) {
			n-=1;
		}
		while(n>=1) {
			System.out.println(n);
			n= n-2;
		}
		sc.close();

	}

}
