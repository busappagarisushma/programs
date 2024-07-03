package june25assignment;

import java.util.Scanner;

class Assignment2 {
	static int getSmallestIndex(int[] x) {
		int small=x[0];
		for(int i=1;i<x.length; i++) {
			if(x[i]<small) {
				small = x[i];
			}
		}
		int indexOfSmall=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==small) {
				indexOfSmall =i;
			}
		}
		return indexOfSmall;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" values");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = getSmallestIndex(arr);
		System.out.println("The Index of Smallest number is "+x);
		
		
		
		sc.close();
		
	}

}
