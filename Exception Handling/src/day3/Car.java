package day3;

class Car {
	void start() {
		System.out.println("Car started");
	} 
	
	public static void main(String[] args) {
		Car c = new Car();
		//c=null;
		if(c!=null) //Avoid NullPointerException
			c.start();
	} 

}
