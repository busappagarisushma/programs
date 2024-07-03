package customexception;

import java.util.Scanner;

class Atm {
	public static void main(String[] args) {
		int balance = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount = sc.nextInt();
		sc.close();
		if(amount<=balance) {
			System.out.println("Amount withdrawn succesfully");
		} else {
			try {
				throw new InsufficientBalanceException("No sufficient Balance!");
			} 
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
