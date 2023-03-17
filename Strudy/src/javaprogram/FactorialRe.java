package javaprogram;

class Calculation
{
	int fact(int n)
	{
		
		int result;
		if(n==1)
			return 1;
		else
		{
			
			result=fact(n-1)*n;
			return result;
		}
	}
}
public class FactorialRe 
{
public static void main(String[] args) 
{
	Calculation c=new Calculation();
	int a=c.fact(4);
	System.out.println(a);
}
}
