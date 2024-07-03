package daysix;
import java.util.Scanner;
public class DaysInAMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month name");
		String x = sc.nextLine();
		switch(x) {
		case "JAN","MAR","MAY","JUL","AUG","OCT","DEC": System.out.println("31 Days"); break;
		case "FEB":System.out.println("28 or 29 Days"); break;
		case "APR","JUN","SEP","NOV":System.out.println("30 Days"); break;
		default: System.out.println("Invalid number");
		}
		
		sc.close();
		

	}

}
