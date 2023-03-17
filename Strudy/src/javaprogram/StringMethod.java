package javaprogram;

import java.util.Scanner;

public class StringMethod 
{
	public static void main(String[] args) 
	{
		String s="priya",p="PRIYA";
		StringBuffer sb = new StringBuffer("priya sharma");
		if(s.equals(p))
		{
			System.out.println(s +" and "+p+" are equal");
		}
		else 
		{
			System.out.println(s +" and "+p+" are not equal");
		}
		System.out.println(sb.reverse());
		System.out.println(s+ " in upper case "+s.toUpperCase());
		System.out.println(p+ " in lower case "+s.toLowerCase());
	}
}
