package stringexamples;

class MethodsExample {
	public static void main(String[] args) {
		String s = "Software Developer";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("soft"));
		System.out.println(s.endsWith("er"));
		System.out.println(s.charAt(7));
		System.out.println(s.indexOf('k'));
		System.out.println(s.indexOf('l'));
		System.out.println(s.contains("Dev"));
		System.out.println(s.contains("dev"));
		
	}

}
