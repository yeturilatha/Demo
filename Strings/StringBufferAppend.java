package Strings;

public class StringBufferAppend {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		//mutable 
		//now original string is changed
		sb.append("world");
		System.out.println(sb);
		
		//insert method
		StringBuffer sb1=new StringBuffer("Hi");
		sb1.insert(2, "welcome");
		System.out.println(sb1);
	}

}