package com;

class Arrays {

	public static void main(String[] args) {

		int[] a = {10,20,30};
		System.out.println("Printin Array Elements in Ascending Order");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Printin Array Elements in Reverse Order");
		for(int i=(a.length-1); i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}
