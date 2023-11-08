package runtimePolymorphism;

public class Main {

	public static void main(String[] args) {
		Bank b =new Bank();
		Bank b1= new SBI();
		Bank b2= new ICICI();
		Bank b3= new HDFC();
		b1.loan();
		b.loan();
		b2.loan();
		b3.loan();

	}

}
