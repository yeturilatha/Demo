package github;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int a=sc.nextInt();
int temp=a;

int count=0;
int temp1=a;
while(a>0)
{
count++;
a=a/10;
}
 int sum = 0;
while(temp>0)
{
	int rem=temp%10;
	int prod=1;
	for(int i=1;i<count;i++)
	{
		prod=prod*rem;
		
	}
	sum=sum+prod;
	temp=temp/10;
}
if(sum==temp1)	
{
	System.out.println("Armstrong no");
}
else
{
	System.out.println("not a armstrong no");
}


	}

}

