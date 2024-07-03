package com;

class Employee {
	
	Employee(int id) {
		System.out.println("Id: "+id);
	}
	
	Employee(double salary) {
		this("Tom",22);
		System.out.println("Salary: "+salary);
	} 
	Employee(String name, int age) {
		this(100); 
		System.out.println("Name: "+name+"     Age: "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e =new Employee(3.3);
		

	}

}
