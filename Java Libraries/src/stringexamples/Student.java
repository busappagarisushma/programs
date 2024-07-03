package stringexamples;

class Student {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println("--------");
		
		System.out.println(s.hashCode());
		System.out.println("--------");
		
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.equals(s2));
	}
}
