package daysix;
import java.util.Scanner;
public class SumOfNNaturalNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of N Natural Numbers: "+sum);
		sc.close();
		

	}

}
