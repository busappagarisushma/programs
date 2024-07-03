package multilevel;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		
		System.out.println("University: "+d.universityName);
		System.out.println("College Name: "+d.collegeName);
		System.out.println("Department Name: "+d.departmentName);
		
		d.conductInternals();

	}

}
