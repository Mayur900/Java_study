package javaprogram;

import java.util.Scanner;

public class Armstrong 
{
public static void main(String[] args) 
{
	int r=0,n,d,m;
	System.out.println("enter any number ");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	m=n;
	while (n!=0) 
	{
		d=n%10;
		r=(d*d*d)+r;
		n=n/10;
	}
	if(m==r)
	{
		System.out.println(m+" "+"is  Armstrong number");
	}
	else
	{
		System.out.println(m+" "+"is not Armstrong number");
	}
}
}
