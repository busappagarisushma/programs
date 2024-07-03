package com;

import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(1.2);
		l.add(10);
		l.add(null);
		l.add("java");
		
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("java"));
		System.out.println("----------");
		
		System.out.println(l);
		l.remove(1.2 );
		System.out.println(l);
		System.out.println("--------");
		
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l);
		System.out.println(l.isEmpty());
	}

}
