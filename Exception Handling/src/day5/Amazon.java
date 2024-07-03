package day5;

import java.util.Scanner;

class Amazon {
	
	static void checkEligibility(int marks) throws Exception {
		if(marks>70) {
			System.out.println("Apply for amazon interview");
		} else {
			throw new InvalidMarksException("Not Eligible for Interview");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int m = sc.nextInt();
		sc.close();
		try {
			checkEligibility(m);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
