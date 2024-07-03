package daysevenmay;
import java.util.Scanner;
public class NPowerP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc .nextInt();
		System.out.println("Enter P value");
		int p = sc.nextInt();
		int result=1;
		int power=p;
		while(p>0) {
			result*=n;
			p--;
		}
		System.out.println(n+" Power "+power+" is "+result);
		sc.close();

	}

}
