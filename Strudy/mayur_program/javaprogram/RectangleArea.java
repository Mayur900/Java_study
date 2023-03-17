package javaprogram;

import java.util.Scanner;

public class RectangleArea 
{
public static void main(String[] args) 
{
	int l,h,area;
	System.out.println("Enter lenth and height");
	Scanner in=new Scanner(System.in);
	l=in.nextInt();
	h=in.nextInt();
	area=l*h;
	System.out.println("Area of rectangle is "+area);
}
}
