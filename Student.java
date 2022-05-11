/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/
package test1;

public class Student 
{
	
	String name;
	public Student(String s)
	{
		name=s;
	}
	public Student()
	{
		name="unknown";
	}

	public static void main(String[] args) 
	{
		System.out.println("When no name is passed");
		Student S2=new Student();
		System.out.println(S2.name);
		
		System.out.println("Name equal to the String value passed");
		Student S1=new Student("sarla");
		System.out.println(S1.name);
	}
}


