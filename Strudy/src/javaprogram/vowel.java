package javaprogram;

import java.util.Scanner;
//check a character where it is vowel and consonant
public class vowel 
{
	public static void main(String[] args) 
	{

		String c;
		System.out.println("enter any character");
		Scanner in=new Scanner(System.in);
		c=in.next();
		char ch=c.charAt(0);
		if(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")||c.equals("A")||c.equals("E")||c.equals("I")||c.equals("O")||c.equals("U"))
		{
			System.out.println(c+" "+"is vowel");
		}
		else
		{
			System.out.println(c+" "+"is consonant");
		}
		in.close();
	}
}
