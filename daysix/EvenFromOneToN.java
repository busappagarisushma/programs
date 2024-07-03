package daysix;
import java.util.Scanner;


public class EvenFromOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
		int i=1;
		while(i<=N) {
			if(i%2==0) {
				System.out.println(i);
			
			}
			i++;
			
		}
		
		sc.close();

	}

}
