package primitivecasting;

class Demo {

	public static void main(String[] args) {
		//Widening
		int a =10;
		double b = a;
		System.out.println(a+" "+b);
		
		double c = 23;
		System.out.println(c);
		
		char x='Z';
		int y = x;
		System.out.println(x+" "+y);
		
		
		
		//Narrowing
		double i = 23.45;
		int j = (int)i;
		System.out.println(i+" "+j);
		
		int z = (int) 12.3;
		System.out.println(z);
		
		int d = 504;
		char h = (char) d;
		System.out.println(d+" "+h);
		
		System.out.println("------");
		
		
		
		System.out.println((int)123.34);
		System.out.println((char)68+(char)65);
		System.out.println("A"+"B");
		System.out.println("A"+10);
		System.out.println(20+"B");
		System.out.println('A'+'B');
		System.out.println('a'+20);
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		
	}

}
