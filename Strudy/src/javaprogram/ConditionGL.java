package javaprogram;

import java.util.Scanner;
//a<b>c
public class ConditionGL
{
public static void main(String[] args) 
{
	int a,b,c;
	System.out.println("Enter any Three Number");
	Scanner  in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a<b&&b>c)
	{
		System.out.println("Condition is true");
	}
	else
	{
		System.out.println("Condition is false");
	}
	
}
}
