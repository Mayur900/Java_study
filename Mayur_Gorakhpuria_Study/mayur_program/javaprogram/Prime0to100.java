package javaprogram;

public class Prime0to100 
{
public static void main(String[] args) 
{

	for(int i=2 ;i<100;i++)
	{
		int n=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				n++;
			}
		}
		if(n==2)
		{
			System.out.println(+i);
			n=0;
		}
	}
	
}
}
