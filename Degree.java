/*Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes.*/
package test1;

public class Degree {
	public void getDegree()
	{
		
		System.out.println("I got a Degree");
	}

	class Undergraduate extends Degree
	{
		public void getDegree()
		{
		System.out.println("I am an Undergraduate");
		}
	}
	class PostGraduate extends Degree
	{
		public void getDegree()
		{
		System.out.println("I am an Postgraduate");
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		Undergraduate U=new Undergraduate();
		U.getDegree();
		PostGraduate P=new PostGraduate();
		P.getDegree();

	}

}
