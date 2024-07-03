package day5;

import java.util.Scanner;

class Gmail {
	
	static void checkOTP(int otp) throws InvalidOTPException {
		if(otp==123) {
			System.out.println("Login Successful");
		} else {
			throw new InvalidOTPException("Invalid OTP");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OTP");
		int otp = sc.nextInt();
		sc.close();
		try {
			checkOTP(otp);
		} catch(InvalidOTPException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
