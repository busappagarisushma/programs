package day3;

class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		
		String s ="Asree";
		//s=null;
		if(s!=null) // Avoiding NullPointerException
			System.out.println(s.length());
		
		System.out.println("End");
	}

}
