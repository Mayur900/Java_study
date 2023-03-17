package javaprogram;

public class NestedTry 
{
public static void main(String[] args) 
{
	try
	{
		System.out.println("inside outer try");
		try
		{
			System.out.println("in nested try");
			int b=10/6;
			try
			{
				System.out.println("inside inner try");
				int[] a=new int[4];
				a[5]=4;
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
	    }
		catch (ArithmeticException e) 
		{
		    System.out.println(e);
		}
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
}
}
