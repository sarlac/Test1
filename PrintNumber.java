package test1;

public class PrintNumber {

	public void printn(int x)
	{
		System.out.println("integer:" +x);
	}
	public void printn(double x)
	{
		System.out.println("double:" +x);
	}
	public void printn(float x)
	{
		System.out.println("float:" +x);
	}
	public void printn(long x)
	{
		System.out.println("long:" +x);
	}
	public static void main(String[] args) 
	{
		PrintNumber P1=new PrintNumber();
		P1.printn(25);
		P1.printn(25.3658);
		P1.printn(5.3);
		P1.printn(859457);

	}

}
