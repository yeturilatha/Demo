package interfac;

public class Account implements Bank{
@Override
public void credit()
{
	System.out.println("credited the amount from the bank");
}
@Override
public void debit() {
	System.out.println("debited the amount from the bank");
}
public static void main(String[]args)
{
	Account c=new Account();
	c.credit();
	c.debit();
	
	
}
}
