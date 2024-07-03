 package com;

public class Student {
	
	public String name = "Asri";
	public int marks = 89;
	
	public static void study() {
		System.out.println("Studying java");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		System.out.println("Name: "+std.name);
		System.out.println("Marks: "+std.marks);
		
		Student.study();
		study();
	}

}
