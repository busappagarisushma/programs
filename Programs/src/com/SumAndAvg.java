package com;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+(sum/a.length));

	}

}












