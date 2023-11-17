package com.cognizant.shapesTest3;

public class Circle {
 private float  radius;// restricting the access modifier to class level
 float pi=(float) 3.5;//package level access
 // constuctor1-default 
public Circle()
{
	this.radius=1.5f;
}
//constuctor2-overloaded with float argument
 Circle (float radius)
{
	
	this.radius=radius;
	
}
 //constructor 3-overloaded with 2 arguments
Circle( float radius, float pi)
{
	this(radius);// invoking constructor 3 with this keyword
	this.pi=3.5f;
	
}
// calculating the area of circle
public float CalculateCircleArea(float radius)
{
	
	return pi*radius*radius;
}
// calculating the circumference of circle
public float Circumference (float radius)
{
	return 2*pi*radius;
	
}
public static void main(String[]args)
{

	Circle ref = new Circle ();
	
	//Calling the methods and printing the results
	float area=ref.CalculateCircleArea(ref.radius);
	System.out.println("area of circle is:"+area);
	 float Circumference= ref.Circumference(ref.radius);
	System.out.println("circumfeence of circle is :"+Circumference );
}
}
