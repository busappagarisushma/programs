package day1;

class Car {

	int cost;
	Car(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return cost+" is the car cost";
	}
	public static void main(String[] args) {
		Car c = new Car(10000);
		System.out.println(c);
	}
}

