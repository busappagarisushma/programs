package june25;

class ArrayProgram3 {
	
	static int getBiggest(int[] x) {
		int max = x[0];
		for(int i=1; i<x.length;i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] ar = { 25,38,20,29,21,27};
		
	}

}
