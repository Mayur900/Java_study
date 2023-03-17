package javaprogram;

import java.util.Scanner;

public class CustomException extends Exception
{
	public CustomException(String s)
	{
		super(s);
	}
	public static void main(String[] args) throws CustomException
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		n=in.nextInt();
		if(n<18)
		{
			throw new CustomException("you are not eligible");
		}
		else 
		{
			System.out.println("you are eligible");
		}
	}
}
