package encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.name="latha";
		e.deptname="software";
		e.loc="Bangalore";
		e.setEmployeeid(1234);
		e.getEmployeeid();
		System.out.println("name of the employee:"+e.name);
		System.out.println("Department name of the employee:"+e.deptname);
		System.out.println("location of the employee:"+e.loc);
		System.out.println("id of the employee:"+e.getEmployeeid());
		
		
	}

}
