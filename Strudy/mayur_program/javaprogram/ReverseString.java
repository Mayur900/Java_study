package javaprogram;

import java.util.Scanner;

public class ReverseString 
{
public static void main(String[] args)
{
	String s;
	System.out.println("enter any String");
	Scanner in=new Scanner(System.in);
	s=in.nextLine();
	for(int i=s.length();i>0;i--)
	{
		System.out.print(s.charAt(i-1));
	}
}

}
