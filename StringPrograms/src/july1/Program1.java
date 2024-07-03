package july1;

import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value");
		String s = sc.nextLine();
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println(s.equals("Helloo"));
		System.out.println(s.equalsIgnoreCase("HELLoo"));
		System.out.println(s.indexOf('a'));
		
		String r = s.trim();
		String[] res = r.split("_");
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		
		
		String k = sc.nextLine();
		System.out.println(k+" "+k.length());
		k = k.trim();
		System.out.println(k+" "+k.length());
	}

}
