package com;

class ForEachLoopDemo {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		for(int i: a) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		double[] marks = {10.2,11.9,129.1};
		for(double j: marks) {
			System.out.println(j);
		}
		
		System.out.println("-------------");
		
		String[] fruits = {"Apple","Mango","Orange","Grapes"};
		for(String s: fruits) {
			System.out.println(s);
		}
	}

}
