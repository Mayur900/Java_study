package javaprogram;

import java.util.Scanner;

//table of even number
public class EvenTable 
{
	public static void main(String[] args) 
	{
		int n,t=1;
		System.out.println("Enter any number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n%2==0)
		{
			for(int i=1;i<=10;i++)
			{
				t=n*i;
				System.out.println(t);
			}
		}
		else 
		{
			System.out.println("number is odd");
		}
		in.close();
	}
}
