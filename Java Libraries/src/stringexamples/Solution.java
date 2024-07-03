package stringexamples;

class Solution {
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		System.out.println(s1); //Hello
		s1.concat(" World");
		System.out.println(s1); //Hello
		System.out.println("--------");
		
		String s2 = new String("Hello");
		System.out.println(s2); //Hello
		s2 = s2.concat(" World");
		System.out.println(s2);  // Hello World
		System.out.println("---------");
		
		StringBuffer s3 = new StringBuffer("Today");
		System.out.println(s3); //Today 
		s3.append(" is Saturday");
		System.out.println(s3); //Today is Saturday
		System.out.println("----------");
		
		StringBuilder s4 = new StringBuilder("Today");
		System.out.println(s4);  //Today
		s4.append(" is weekend");
		System.out.println(s4); //Today is weekend
		
	}

}
