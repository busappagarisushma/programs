package com;

import java.util.LinkedList;

class Example {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(10);
		l.add(40);
		
		System.out.println(l); //[10, 20, 10, 30, 10, 40]
		System.out.println(l.indexOf(10)); //0
		System.out.println(l.lastIndexOf(10));  //4
		System.out.println("----------");
		
		//forward traversing
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("-----------");
		
		
		// reverse traversing
		
		for(int i=l.size()-1; i>=0; i-- ) {
			System.out.println(l.get(i));
		}
		System.out.println("------------");
	}
	
	
}
