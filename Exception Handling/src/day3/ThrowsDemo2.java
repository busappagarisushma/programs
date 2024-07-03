package day3;

class ThrowsDemo2 {
	
	static void  display() throws Exception {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			Thread.sleep(10);
		}
	}
	
	public static void main(String[] args) {
		try {
			display();
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		
	}

}
