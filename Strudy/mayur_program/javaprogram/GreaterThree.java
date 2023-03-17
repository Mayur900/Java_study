package javaprogram;

import java.util.Scanner;

public class GreaterThree 
{
	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter any three number");
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a+" is greater");
		}
		if(b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}
}
