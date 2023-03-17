package javaprogram;

public class pyramid6 
{
	public static void main(String[] args) 
	{
		int temp=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=temp;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("$");
			}
			System.out.println();
			temp--;
		}

	}
}
