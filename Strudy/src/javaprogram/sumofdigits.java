package javaprogram;

import java.util.Scanner;

//sum of digits
public class sumofdigits 
{
public static void main(String[] args) 
{
	int n,sum=0,d;
	System.out.println("enter any number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n!=0)
	{
		d=n%10;
		sum=sum+d;
		n=n/10;
	}
	System.out.println("sum of digit is"+" "+sum);
	in.close();
}
}
