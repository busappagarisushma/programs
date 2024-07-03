package nonprimitivecasting;

class MainClass {

	public static void main(String[] args) {
		//Upcasting - Implicitly
		Father f = new Son();
		System.out.println(f.name);
		System.out.println("----------");

		//Downcasting - Explicitly

		Son s = (Son) f;
		System.out.println(s.name);
		System.out.println(s.age);	

	}

}
