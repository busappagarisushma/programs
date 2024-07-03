package june28;

class Assignment2 {

	static  void removeDuplicates(int[] x) {

		int count=0;
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]==x[j]) {
					count++;
				}
			}
		}
		int ar[] = new int[count];
		int p=0;
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]==x[j]) {
					ar[p++]=j;
				}
			}
		}
		for(int ele:ar) {
			System.out.println(ele+" ");
		}

		int[] y = new int[x.length-count];
		int k=0,n=0;
		for(int i=0; i<x.length; i++) {
			if(ar[n++]!=i) {
				System.out.println(n+" "+i);
				y[k++]=x[i];

			}


		}
		for(int ele:y) {
			System.out.println(ele);
		}
		//System.out.println(y.length);

	}
	public static void main(String[] args) {
		int[] a = {20,30,20,30,40};
		removeDuplicates(a);
	}
}
