package github;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=n;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
