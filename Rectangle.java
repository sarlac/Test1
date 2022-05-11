/*Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

package test1;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	Rectangle()
	{
	this.length=0;
	this.breadth=0;
	}
	Rectangle(int length, int breadth)
	{
	this.length=length;
	this.breadth=breadth;
	}
	Rectangle(int length)
	{
	this.length=length;
	this.breadth=length;
	}
	int area()
	{
		return length*breadth;
	}
	
	public static void main(String[] args) 
	{
	Rectangle R1=new Rectangle();
	System.out.println("Area of Rectangle 1:" +R1.area());

	Rectangle R2=new Rectangle(20,30);
	System.out.println("Area of Rectangle 2:" +R2.area());
	
	Rectangle R3=new Rectangle(10);
	System.out.println("Area of Rectangle 3:" +R3.area());
	}

}
