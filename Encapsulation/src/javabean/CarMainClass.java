package javabean;
import java.util.Scanner;
public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Car Brand");
		String s = sc.nextLine ();
		Car c = new Car();
		c.setBrand(s);
		
		System.out.println("Brand: "+c.getBrand());
		
		String s1 = c.getBrand();
		System.out.println("Brand: "+s1);
		
		sc.close();
		

	}

}
