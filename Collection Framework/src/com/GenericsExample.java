package com;

import java.util.ArrayList;
import java.util.LinkedList;

class GenericsExample {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Hiii");
		l.add("Hello");
		l.add("Byee");

		for(String s:l) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("------------");

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(300);
		ll.add(20);

		for(int i: ll) { //for(Integer i:ll)
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------");

		ArrayList al = new ArrayList();
		al.add("Asri"); //al.add(new String("Asri"));
		al.add(22);
		al.add(1.4);
		al.add('s');

		// Generalization or Upcasting
		// Object obj = new String("Asri");
		// Object obj = new Integer(22);
		// Object obj = new Double(1.4);
		// Object obj = new Character('s');

		for(Object obj:al) {
			System.out.println(obj);  // internally -> obj.toString()
		}	
	}
}
// Note: toString() is overridden in all wrapper classes & String class.