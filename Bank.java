package test1;
import java.util.*;
public class Bank 
	{

	public void getBalance();
	
	class BankA extends Bank
	{
		   public void getBalance()
		   {
		       System.out.println("Money deposited in Bank A is $1000");
		   }

	}
	class BankB extends Bank
	{
		   public void getBalance()
		   {
		       System.out.println("Money deposited in Bank B is $1500");
		   }
	}

	class BankC extends Bank
	{
		   public void getBalance()
		   {
		       System.out.println("Money deposited in Bank C is $2000");
		   }
	}



	public static void main(String[] args)

	{
		    Bank A = new BankA();
		    A.getBalance();
		    Bank B= new BankB();
		    B.getBalance();
		    Bank C = new BankC();
		    C.getBalance();
	}

}

	


