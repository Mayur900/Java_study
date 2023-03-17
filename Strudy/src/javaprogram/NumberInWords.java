package javaprogram;

import java.util.Scanner;

public class NumberInWords 
{
public static void main(String[] args) 
{
	int n,d,r=0;
	System.out.println("Enter any number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n!=0)
	{
		d=n%10;
		r=(r*10)+d;
		n=n/10;
	}
	
	while(r!=0)
	{
		d=r%10;
		if(d==0)
		{
			System.out.print("zero ");
		}
		if(d==1)
		{
			System.out.print("one ");
		}
		if(d==2)
		{
			System.out.print("two ");
		}
		if(d==3)
		{
			System.out.print("three ");
		}
		if(d==4)
		{
			System.out.print("four ");
		}
		if(d==5)
		{
			System.out.print("five ");
		}
		if(d==6)
		{
			System.out.print("six ");
		}
		if(d==7)
		{
			System.out.print("seven ");
		}
		if(d==8)
		{
			System.out.print("eight ");
		}
		if(d==9)
		{
			System.out.print("nine ");
		}
	r=r/10;
		
	}
}
}
