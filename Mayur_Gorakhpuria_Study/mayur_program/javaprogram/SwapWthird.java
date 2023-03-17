package javaprogram;

import java.util.Scanner;

// Swapping of two number without using third number
public class SwapWthird 
{
public static void main(String[] args)
{
	int a,b;
	System.out.println("Enter the value of a and b");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("value of a ="+a);
	System.out.println("value of b ="+b);
	in.close();
}
}
