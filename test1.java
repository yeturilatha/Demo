package Activity;
import java.util.Scanner;

public class test1 {
	public static int add(int a, int b)
	{
		int c=a+b;
		System.out.println("the addition result is");
		return c;
	}
	public static int sub(int a, int b)
	{
		int c;
		if(a>b)
		{
			c=a-b;
		}
		else {
			c=b-a;
		}
		System.out.println("the subtraction result is");
		return c;
	}
	public static int multi(int a, int b)
	{
		int c=a*b;
		System.out.println("the multiplication result is");
		return c;
	}

	
	
public static void main(String[]args)
{
	
	System.out.println(" welcome to laptop ");
	System.out.println("Enter the options");
	Scanner sc=new Scanner(System.in);
	int i=1;
	while (i==1)
	{
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2  for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4  for even/odd");
		System.out.println("Enter 5  for quit");
		System.out.print("Enter the two numbers for operation");
		int in=sc.nextInt();
		if(in==1)
		{
			System.out.println("Enter the first number");
			int a=sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println(add(a,b));
		}
		else if(in==2)
		{
			System.out.println("Enter the first number ");
			int a=sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println(sub(a,b));
		}
		else if(in==3)
		{
			System.out.println("Enter the first number ");
			int a=sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println(multi(a,b));
		}
		else if(in==4)
		{
			System.out.println("Enter the first number ");
			int a=sc.nextInt();
			

			if(a%2==0)
			{
				System.out.println("even no");	
			}
			else {
				System.out.println("odd no");
			}
		}
		else if(in==5)
		{
			
		
		break;
		}
		
		
		
		
	
	
	
	}
}
}
