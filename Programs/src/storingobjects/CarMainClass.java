package storingobjects;

public class CarMainClass {

	public static void main(String[] args) {
		Car c1 = new Car("Audi",10000000);
		Car c2 = new Car("BMW",23989000);
		Car c3 = new Car("Suzuki",189000000);
		

		Car[] c = {c1,c2,c3};

		for(int i=0; i<c.length; i++) {
			System.out.println("Brand: "+c[i].brand+" ---- Cost: "+c[i].cost);
		}

	}



}
