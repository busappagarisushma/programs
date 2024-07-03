package rtp;

class Employee {
	void work() {
		System.out.println("Employee is working");
	}

}

class Developer extends Employee { //rule-1
	@Override //rule-2
	void work() {
		System.out.println("Developing app");
	}
}

class Tester extends Employee { //rule-1
	@Override //rule-2
	void work() {
		System.out.println("Testing app");
	}
}
