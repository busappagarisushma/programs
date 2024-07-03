package contentcomparison;

class Person {
	String name;
	int height;
	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.height == p.height;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Tom",5);
		Person p2 = new Person("Jerry",5);
		
		if(p1.equals(p2)) {
			System.out.println(p1.name+" and "+p2.name+" have same height.");
		} else {
			System.out.println(p1.name+" and "+p2.name+" have different height.");
		}
	}

}
