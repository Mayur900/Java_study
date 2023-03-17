package javaprogram;

public class pyramid5 
{
public static void main(String[] args) 
{
	int i,j,k,temp=0;
	for(i=5;i>=1;i--)
	{
		for(k=1;k<=temp;k++)
		{
			System.out.print(" ");
		}
		for( j=i;j>=1;j--)
		{
			System.out.print("$ ");
			
		}
		System.out.println();
		temp++;
	}

}
}
