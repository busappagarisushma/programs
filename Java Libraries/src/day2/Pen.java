package day2;

class Pen {

	int cost;
	Pen(int cost) {
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Cost: "+cost;
	}
	
	
	public static void main(String[] args) {
		Pen p1 = new Pen(100);
		Pen p2 = new Pen(300);
		System.out.println(p1);
		System.out.println(p2);
	}
}
