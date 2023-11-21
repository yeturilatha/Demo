package Strings;

public class IndexOf {

	public static void main(String[] args) {
		String s= "Bangalore is called as cool city";
		//String indexOf(int char) method//
		int i= s.indexOf("is");
		System.out.println(i);
		
		//String indexOf(int char, int fromindex) method//

             int a=s.indexOf("c",12);
             System.out.println(a);
             
             // int IndexOf(String subString) method//
             int d = s.indexOf("cool");
             System.out.println(d);
             
             
	}
}


