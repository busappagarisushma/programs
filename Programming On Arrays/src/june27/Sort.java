package june27;

class Sort {
	
	static int[] mergeSort(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		
		while(i<a.length)
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
		return c;
	}
	public static void main(String[] args) {
		int[] x = {10,32,89,172};
		int[] y = {20,80,100,801};
		int[] z =  mergeSort(x,y);
		for(int i:z) {
			System.out.println(i);
		}
		
	}

}
