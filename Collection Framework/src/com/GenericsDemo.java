package com;

import java.util.ArrayList;

class GenericsDemo {
	public static void main(String[] args) {
		int a=10;
		double b=1.5;
		
		ArrayList al = new ArrayList();
		al.add(a); //al.add(new Integer(10)); -> Auto-Boxing
		al.add(b); //al.add(new Double(1.5)); -> Auto-Boxing
		
		
		// Upcasting -> Object obj = new Integer(10) & Object obj = new Double(1.5);
		for(Object obj:al) {
			System.out.println(obj);
		}
		
	}

}
