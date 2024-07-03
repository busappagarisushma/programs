package june25assignment;

import java.util.Scanner;

class Assignment4 { 
	static int getEvenCount(int[] x,int ele) {
		int count=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==ele) {
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" values");
		for(int i=0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value to search");
		int x = sc.nextInt();
		
	}

}
