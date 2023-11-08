package superKeyword;

public class Student extends Person{
	
	String name = "kavya";
	String Course = "MBBS";
	Student(){
		super();
		System.out.println("calling the student constructor");
	}
	public void display()
	{
		super.display();
		System.out.println("person"+name+"doing the"+Course);
	}

}
