package vehicle;

class Car extends Vehicle{
	
	@Override
	void start() {
		super.start();
		System.out.println("Car started");
		super.start();
	}

}
