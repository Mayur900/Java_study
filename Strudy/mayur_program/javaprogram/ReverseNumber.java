package javaprogram;

import java.util.Scanner;

//reverse a number
public class ReverseNumber 
{
public static void main(String[] args) 
{
	int n,d,r=0;
	System.out.println("enter any number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n!=0)
	{
		d=n%10;
		r=(r*10)+d;
		n=n/10;
	}
	System.out.println("reverse number"+r);	
	in.close();
}
}
