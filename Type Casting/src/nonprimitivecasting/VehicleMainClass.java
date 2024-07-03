package nonprimitivecasting;

class VehicleMainClass {
	public static void main(String[] args) {
		Vehicle v = new Car(); //upcasting
		System.out.println(v.brand+" "+v.color);

		Car c = (Car) v;  //downcasting
		System.out.println(v.brand+" "+v.color);
		c.drive();
	}
}
