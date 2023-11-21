package Strings;

public class String_split {

	public static void main(String[] args) {
		
		String s="yeturi@latha@gmail.com";
		// String[] n=s.split("@");//
		 String[] n=s.split("@", 2);
		 for(String a:n)
		System.out.println(a);

	}

}
