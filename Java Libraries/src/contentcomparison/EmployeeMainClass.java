package contentcomparison;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Asritha");
		Employee e2 = new Employee(101,"Asri");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(new Employee(101,"Asritha")));
		
		if(e1.equals(e2)) {
			System.out.println("Id and Name are same");
		} else {
			System.out.println("Id or Name are different");
		}
		
	}

}
