package javaprogram;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultipalCatch 
{
public static void main(String[] args) 
{
	int[] c=new int[4];
	int a,b;
	System.out.println("plz enter");
	Scanner in=new  Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	try
	{
		c[5]=a/b;
		System.out.println(c);
	}
	catch (ArithmeticException e) 
	{
		System.out.println(e);
	}
	catch (InputMismatchException e) 
	{
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException e) 
	{
        System.out.println(e);
	}
	
	catch (Exception e) 
	{
		System.out.println(e);
	}
	in.close();
}
}
