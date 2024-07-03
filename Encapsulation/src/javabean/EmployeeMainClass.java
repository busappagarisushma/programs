package javabean;
import java.util.Scanner;
public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter your ID");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name");
		String n = sc.nextLine();
		
		
		e.setId(i);
		e.setName(n);
		System.out.println(e.getId());
		System.out.println(e.getName());
		
		sc.close();

	}

}
