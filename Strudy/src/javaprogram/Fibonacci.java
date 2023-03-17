package javaprogram;

import java.util.Scanner;

public class Fibonacci 
{
public static void main(String[] args) 
{
	int f1=-1,f2=1,f3,n;
	System.out.println("enter any number");
	Scanner in =new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<=n;i++)
	{
		f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
	}
	in.close();
}
}
