
public class stringsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello ");
        String d = new String("Asritha Royal ");
        String a = new String(".....");
        
        //length
        
        System.out.println(s.length()); //6
        System.out.println(d.length()); //14
        System.out.println(a.length()); //5
        
        System.out.println("Hello  asri".length());
        
        //Concat
        
        System.out.println(s.concat(a)); //Hello .....
        System.out.println(s.concat(d+a)); //Hello Asritha Royal .....
        
        //trim
        
        String z = new String("  Asree  ");
        System.out.println(z.length()); //9
        System.out.println(z.trim());           //Asree
        System.out.println(z.trim().length());  //

        //charAt
        
        System.out.println(d.charAt(5));  //h
        
        //contains
        
        System.out.println(s.contains("ll"));  // true
        System.out.println(s.contains("LL"));  // false

	}

}
