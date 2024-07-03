package day1;


class MethodExample1 {
	
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());  // -> Only Message
			System.out.println("-----------");
			System.out.println(e);               // -> Exception Name & Message
			System.out.println("-----------");
			e.printStackTrace();                 // -> Exception Name, Line Number & Message
			
		}
		System.out.println("end");
	}

}
