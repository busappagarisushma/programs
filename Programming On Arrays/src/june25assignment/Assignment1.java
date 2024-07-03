package june25assignment;

import java.util.Scanner;

class Assignment1 {
	
	static int getBiggestIndex(int[] x) {
		int big = x[0];
		for(int i=1;i<x.length; i++) {
			if(x[i]>big)
				big=x[i];
		}
		
		int index=0;
		for(int i=0;i<x.length; i++) {
			if(x[i]==big)
				index=i;
		}
		
		
		return index;
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = getBiggestIndex(arr);
		System.out.println("The index of Biggest number is "+x);
		sc.close();
		
		
		
	}

}
