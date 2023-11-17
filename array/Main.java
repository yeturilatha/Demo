package array;

public class Main {

	public static void main(String[] args) {
		Employee arr[];
		arr= new Employee [3];
		arr[0] =new Employee (101,"lathika","Bangalore");
		arr[1] =new Employee(102,"kavya","chennai");
		arr[2] =new Employee(103,"rani","tirupathi");
		
for(Employee i:arr)
{
	System.out.println(i.EmpId+" "+i.EmpName+" "+i.EmpLoc);
}
	}

}
