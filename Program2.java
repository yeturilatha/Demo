package github;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age =sc.nextInt();
	if(age<=15)
	{
		System.out.println(" Not eligible for voting ");
	}
	else if(age<=18 && age>=16)
	{
		System.out.println(" Eligible for voting");
	}
	else {
		System.out.println("too older to vote");
	}
	}

}
