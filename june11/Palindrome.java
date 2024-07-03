package june11;

class Palindrome {
	
	static boolean isPalindrome(int n) {
		int rev=0, t=n;
		do {
			rev = rev*10 + n%10;
			n/=10;
		} while(n!=0);
		
		return t==rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Printing 3 digit palindrome numbers");
		for(int i=100; i<=999; i++) {
			if(isPalindrome(i)) {
				System.out.println(i+" ");
			}
		}
	}

}
