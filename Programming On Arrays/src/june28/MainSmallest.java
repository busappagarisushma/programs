package june28;

class MainSmallest {
	
	static int nthSmallestElement(int[] ar, int n) {
		for(int i=0; i<ar.length; i++) {
			int count=0;
			for(int j=0; j<ar.length; j++) {
				if(ar[j]>=ar[i])
					count++;
			}
			if(count==n) {
				return ar[i];
			}
		}
		System.out.println(n+" Smallest is not there");
		return 0;
		
	}
	public static void main(String[] args) {
		int[] x = {10,40,20,103,22};
		System.out.println("1 th Biggest is: "+nthSmallestElement(x, 1));
	}

}
