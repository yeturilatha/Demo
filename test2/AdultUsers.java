package test2;

public class AdultUsers implements LibraryUser{
int age;
String bookType;
	@Override
	public void registerAccount() {
		if (age>12)
		{
			System.out.println("you have successfully registered under the adult Account");
		}
		else if (age<12)
		{
			
			System.out.println("Sorry ,Age must be greater than 12 to register as a adult");
		}
	}
	@Override
	public void requestBook() {
		if(bookType=="Fiction")
		{
			System.out.println("Books issued successfully ,please return the book within 7 days");
		}
		else
		{
			System.out.println("OOps , you are  allowed to take only adult fiction books");
		}
		
	}
	/*public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}*/
	

}
