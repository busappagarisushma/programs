package june25;

class ArrayProgram2 {
	public static void main(String[] args) {
		int[] ar = { 25,38,20,29,21,27};
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
			if(i<ar.length-1) 
				System.out.print(",");
		}
	}

}
