package june25;

class ArrayProgram1 {
	public static void main(String[] args) {
		int[] ar = {25, 45, 67, 89, 87, 45};

		System.out.println("Number of elements in the array: "+ar.length);
		System.out.println("First element: "+ar[0]);
		System.out.println("Last element: "+ar[1]);
		
		//using for
		for(int i=0; i<ar.length; i++) {
			System.out.println(i+" -> "+ar[i]);
		}
		//using for each
		for(int ele: ar) {
			System.out.println(ele);
		}
		
	}

}
