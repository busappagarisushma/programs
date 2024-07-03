package june28;

class Assignment1 {
	
	static int[] insertArray(int[] x, int[] y, int position) {
		int p = position,b=0;
		int[] z = new int[x.length+y.length];
		for(int i=0; i<z.length; i++) {
			if(i<position) {
				z[i] = x[i]; 
			} else if(i > position-1+y.length) {
				z[i] = x[p++];
			} else {
				z[i] = y[b++];
			}
		}
		return z;
	}


	
	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,80,30,60};
		int[] ar2 = {78,92,42,56,64};
		int[] ar3 = insertArray(ar1,ar2,5);
		for (int a: ar3) {
			System.out.println(a);
		}
		
	}
}
