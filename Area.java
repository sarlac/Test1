/*Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.*/
package test1;

public class Area {

		public void area_(int side)
		{
		 int A1;
		 A1=side*side;
		 System.out.println("Area of the Square :" +A1);
		}
		public void area_(int length, int breadth)
		{
		int A2;
		A2=length*breadth;
		System.out.println("Area of the Rectangle : " +A2);
		}
		
		
		public static void main(String[] args) 
		{
			Area A=new Area();
			A.area_(5);
			A.area_(2,5);
		}

}
