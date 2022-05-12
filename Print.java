/*Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/
package test1;

public class Print 
{
	public void printn(int a,char c)
	{
		System.out.println("Integer is "+a+ "\t Character is " +c);
	}
	public void printn(char c,int a)
	{
		System.out.println("Character is "+c+ "\t Integer is " +a);
	}
	
	public static void main(String[] args) 
	{
		Print P=new Print();
		P.printn(10,'M');
		P.printn('M',20);
		
	}
	
}
