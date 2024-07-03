package stringexamples;

class MethodsDemo2 {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		String c = "jaVa";
		System.out.println(a.equals(b));  //true
		System.out.println(a.equals(c));  //false
		System.out.println(a.equalsIgnoreCase(c)); //true
		System.out.println("----------");
		
		
		String x = "Hello World";
		System.out.println(x.substring(3));  //lo World
		System.out.println(x.substring(8));  //rld
		System.out.println(x.substring(2, 9)); //llo Wor
		System.out.println(x.substring(1, 10)); //ello Worl
		System.out.println("-----------");
		
		String s ="Hai";
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("----------");
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
	}
	
	

}
