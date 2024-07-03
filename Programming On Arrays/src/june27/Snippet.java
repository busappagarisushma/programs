package june27;

class Snippet {
	public static void main(String[] args) {
		int[] ar = new int[10];
		for(int i=0; i<=9; i++)
			ar[i]=9-i;
		for(int i=0; i<=9; i++)
			ar[i]=ar[9-i];
		for(int k:ar)
			System.out.println(k);
	}

}
