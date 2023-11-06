package Package2;

import encapsulation.Account;

public class Customer extends Account{



	public static void main(String[] args) {
		Customer c=new Customer();
		c.address="2-2022,reddystreet";
		c.Loc="Banglore";
		c.setaccountno( 679798729.47);
		c.getaccountno();
		c.setIFSCcode(1234);
		c.getIFSCcode();
		System.out.println("address is:"+c.address);
		System.out.println("location is:"+c.Loc);
		System.out.println("account no is:"+c.getaccountno());
		System.out.println("IFSCcode is:"+c.getIFSCcode());
		c.display();
		
	}

}
