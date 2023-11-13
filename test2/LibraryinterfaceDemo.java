package test2;

public class LibraryinterfaceDemo {

	public static void main(String[] args) {
		KidsUsers k =new KidsUsers ();
		
//k.setAge(10);//
//k.setAge(18);//
k.registerAccount();
//k.setBookType("Kids");//
//k.setBookType("Fiction");
k.requestBook();


AdultUsers a=new AdultUsers();

//a.setAge(5);
//a.setAge(23);
//a.registerAccount();

//a.setBookType("Kids");
//a.setBookType("Fiction");
a.requestBook();

	}

}
