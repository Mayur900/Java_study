package javaprogram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch 
{
	int count=0;
	public int isPatternMatching(String line,String word)
	{
	Pattern ptn=Pattern.compile(word);
		Matcher m=ptn.matcher(line);
		
		if(m.lookingAt())
		{
			 count++;
				
		}
		return count;
		
	}
	
public static void main(String[] args) 
{
	int c=0;
	StringMatch p=new StringMatch();
	Scanner in=new Scanner(System.in);
	System.out.println("enter string");
	String s=in.nextLine();
	System.out.println("enter word to search");
	String s1=in.next();

	String[] str=s.split(" ");
	for(String st:str)
	{
		 c= p.isPatternMatching(st,s1);
	}
	System.out.println(c);
}
}
