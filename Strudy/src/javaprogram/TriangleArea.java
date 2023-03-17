package javaprogram;

import java.util.Scanner;

public class TriangleArea
{
public static void main(String[] args) 
{
	int h,b,area;
	System.out.println("enter height and bright");
	Scanner in=new Scanner(System.in);
	h=in.nextInt();
	b=in.nextInt();;
	area=(h*b)/2;
	System.out.println("Area of triangle is "+area);
}
}
