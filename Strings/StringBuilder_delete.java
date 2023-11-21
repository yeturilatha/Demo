
package Strings;

public class StringBuilder_delete {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("how are you");
		// delete(starting index , end index)//
        s.delete(0, 3);
         System.out.println(s);
         // deletecharAt()
         s.deleteCharAt(3);
         System.out.println(s);
	}

}
