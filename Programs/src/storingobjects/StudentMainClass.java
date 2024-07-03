package storingobjects;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student(21,"Asri");
		Student s2 = new Student(22,"Sushma");
		
		Student[] s = {s1,s2};
		
		for(int i = 0; i<s.length; i++) {
			System.out.println("Age: "+s[i].age);
			System.out.println("Name: "+s[i].name);
			
		}
				

	}

}
