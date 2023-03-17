package javaprogram;

import java.util.Scanner;

//Factorial of a number
public class Factorial 
{
	public static void main(String[] args) 
	{
		int f=1,i,n;
		System.out.println("enter any number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("factorial is"+" "+f);
	}
}
