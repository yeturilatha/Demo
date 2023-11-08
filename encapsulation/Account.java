package encapsulation;

public class Account {
	
private  Double accountno;
private  int IFSCcode;
protected String address;
protected  String Loc;
double amount=8000.0;

public void setaccountno(Double accountno)
{
	this.accountno=accountno;
}
public Double getaccountno()
{
	return accountno;
}
public void setIFSCcode(int  IFSCcode)
{
	this.IFSCcode=IFSCcode;
}
public int getIFSCcode()
{
	return IFSCcode;
}
public void display()
{
	System.out.println("the amount in the account is:"+amount);
}
}