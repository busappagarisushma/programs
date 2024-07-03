package day1;

class Student {
	
	public String toString() {
		super.toString();
		return "12301";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);  //implicitly calling toString()
		System.out.println(s.toString()); //explicitly calling toString()
		System.out.println(new Student()); //impicitly calls toString()
	}

}
