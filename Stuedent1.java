/*Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects*/
package test1;
public class Stuedent1 {
	String name;
	int age;
	String address;
	public Stuedent1()
	{
		name="unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String nam,int ag)
	{
		name=nam;
		age=ag;
		System.out.println("Name of the student is " + name + "age is" + age);
	}
	public void setInfo(String nam1,int ag1,String Addres)
	{
		name=nam1;
		age=ag1;
		address=Addres;
		System.out.println("Name of the student is " + name + "age is" + age + "Address is" +address);
	}
	public static void main(String[] args) 
	{
		Stuedent1 Stud=new Stuedent1();
		Stud.setInfo("sarla",35);
		Stud.setInfo("mansa", 6,"Wagholi");
	}
}
