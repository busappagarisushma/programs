package june25assignment;

import java.util.Scanner;

class Assignment3 {
	static int getEvenCount(int[] x) {
		int count=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]%2==0) {
				count++;
			}
		}
		return count;
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
		int evenCount = getEvenCount(arr);
		System.out.println("There are "+evenCount+" even numbers and "+(arr.length-evenCount)+" odd numbers in the array");
		sc.close();
	}

}
