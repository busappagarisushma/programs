package org;

import com.Mobile;


//Accessing public members in different package
public class MobileMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Mobile.brand);
		
		Mobile m = new Mobile();
		System.out.println(m.cost);

	}

}
