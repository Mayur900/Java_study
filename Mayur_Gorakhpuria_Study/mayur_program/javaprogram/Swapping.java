package javaprogram;

import java.util.Scanner;

//swapping of two  number 
public class Swapping 
{
public static void main(String[] args)
{
	int a,b,c;
	System.out.println("Enter the value of a and b ");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("value of a ="+a);
	System.out.println("value of b ="+b);
	in.close();
}
}
