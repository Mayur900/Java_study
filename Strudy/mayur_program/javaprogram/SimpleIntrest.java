package javaprogram;

import java.util.Scanner;

public class SimpleIntrest 
{
public static void main(String[] args) 
{
	double p,r,t,si;
	System.out.println("Enter the value of principal ,rate and time");
	Scanner in=new Scanner(System.in);
	p=in.nextDouble();
	r=in.nextDouble();
	t=in.nextDouble();
	si=(p*r*t)/100;
	System.out.println("Simple Intrest is "+si);
}
}
