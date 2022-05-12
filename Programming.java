/* Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed.*/

package test1;

public class Programming {
	
	Programming()
	{
		System.out.println("I love programming language");
	}
	Programming(String s)
	{
		System.out.println("I Love " +s);
	}
	
	public static void main(String[] args) 
	{
		Programming P1=new Programming();
		Programming P2=new Programming("CPP");
		
	}

}
