package practiceprograms;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********************************");
		System.out.println("Ascending Order");
		int[] a= {10,20,30};
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("----------");
		
		String[] fruits = {"Apple","Banana","Mango","Grapes","Orange"};
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		System.out.println("***************************************");
		
		System.out.println("Descending Order");
	
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		System.out.println("----------");
		
		for(int i=fruits.length-1; i>=0; i--) {
			System.out.println(fruits[i]);
		}
		
	}

}
