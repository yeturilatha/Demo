package multipleInheritance;

public class Customer implements Bike,Car{

	@Override
	public void buy() {
		System.out.println("i buy a bike with a  reasonable price ");
	}

	@Override
	public void bought() {
		System.out.println("i buy a car with a  reasonable price");
		
	}


public static void main(String []args)
{
	Customer c=new Customer();
			c.buy();
			c.bought();
		
}
}