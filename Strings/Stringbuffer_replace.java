package Strings;

public class Stringbuffer_replace {

	public static void main(String[] args) {
		StringBuffer b= new StringBuffer("All is well ");
		b.replace(0,2, "i");
		System.out.println(b);
	}

}
