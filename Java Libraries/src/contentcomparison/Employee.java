package contentcomparison;

class Employee {
	
	int id;
	String name;
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { //Object obj = new Employee(101,"Tom");
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			System.out.println(this.id+" "+e.id+" "+this.name+" "+e.name);
			return this.id == e.id && this.name.equals(e.name);
		}
		return false;
	}
	
	//e1 -> this
	//e2 -> obj
	//For String comparison, do not use ==, kindly use equals().

}
