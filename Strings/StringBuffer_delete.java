package Strings;

public class StringBuffer_delete {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("how are you");
		// delete(starting index , end index)//
        s.delete(0, 3);
         System.out.println(s);
         // deletecharAt()
         s.deleteCharAt(3);
         System.out.println(s);
	}

}
