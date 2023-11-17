package array;

public class Addition {
 static void add(int a[])
 {
	  int add = 0;
	for(int i:a)
	{
		add=add+i;
		
	}
	System.out.println("sum of the elements:"+add);
	 
 
	 
 }
 public static void main(String[]args) {
		int arr[]= {1,2,3,4};
		add(arr);
	}
}

