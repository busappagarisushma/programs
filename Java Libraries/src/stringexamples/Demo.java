package stringexamples;

class Demo {
	public static void main(String[] args) {
		String s = new String("Java");
		System.out.println(s.hashCode());
		System.out.println(s);
		
		System.out.println("------");
		String a = new String("A");
		System.out.println(a.hashCode());
		System.out.println("------");
		String s1 = new String();
		System.out.println(s1);
		String s2 = new String();
		System.out.println(s1==s2);
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
	}

}
