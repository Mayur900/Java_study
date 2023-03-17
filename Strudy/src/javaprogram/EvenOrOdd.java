package javaprogram;

import java.util.Scanner;

public class EvenOrOdd 
{
public static void main(String[] args) 
{
	int a;
	System.out.println("Enter any number");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	if(a%2==0)
	{
		System.out.println(a+" is even");
	}
	else
	{
		System.out.println(a+" is odd");
	}
}
}
