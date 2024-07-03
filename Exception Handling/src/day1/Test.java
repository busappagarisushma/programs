package day1;

class Test {
	public static void main(String[] args) {
		System.out.println("start");
		
		int a[] = {10,20,30,40};
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println(a[i]);
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		
		System.out.println("end");
	}
	
	

}
