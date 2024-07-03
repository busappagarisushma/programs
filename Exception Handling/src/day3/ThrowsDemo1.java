package day3;

class ThrowsDemo1 {
	static void div() throws ArithmeticException {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		try {
			div(); //method caller
		}
		catch(ArithmeticException e) {
			System.out.println("Handled");
		}
	}

}
