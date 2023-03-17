package javaprogram;

import java.util.Scanner;

public class CircleArea 
{
public static void main(String[] args) 
{
	double r,area;
	System.out.println("enter the radious of circle");
	Scanner in=new  Scanner(System.in);
	r=in.nextDouble();
	area=3.14*r*r;
	System.out.println("Area of circle is "+area);
}
}
