package contentcomparison;

class Student {
	
	int age;
	Student(int age) {
		this.age= age;
	}
	
	public boolean equals(Object obj) { //1.Upcasting -> Object obj = new Car(20);
		if(obj instanceof Student) {    //2.Checking if obj is having Student object
			Student s = (Student)obj;   //3.If yes, downcasting to access subclass data
			return this.age == s.age;   //4.comparison logic -> s1.age == s2.age -> 21==21
		}
		return false;                   //5. If No(else) -> negative scenario, return false
	}
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student(21);
		Student s2 = new Student(21);
		System.out.println(s1.equals(s2)); //s1.equals(new Student(20));
	}

}

//s1 -> this -> current object
//s2 -> obj (upcasted reference) -> s (downcasted reference)
// In above program, upcasting is achieved when we call equals().


