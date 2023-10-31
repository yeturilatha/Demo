package  day;

public class Employee {
	
  Employee(String name ,
	int i,
	int age,
	String dept)
  {
	  System.out.println("employee details are:");
  System.out.println("employee name:"+name+"employee salary:"+i+"employee age:"+age+"employee dept:"+dept);
  
	 
  }
  
	public static void man(String[] args) {
		System.out.println("employee  list :");
		Employee e1 = new Employee("latha",400000,22,"developer");
		Employee e2 = new Employee("kavya", 300000, 25, "medico");
		
		
	}

}
