package interfac;

public class Customer implements Bank {

	@Override
	public void credit() {
		System.out.println("customer credited the amount");
		
	}

	@Override
	public void debit() {
		System.out.println("customer debited the amount");
		
	}

}
