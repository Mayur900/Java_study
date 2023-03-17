package javaprogram;

import java.util.Scanner;

public class TypeCasting 
{
public static void main(String[] args) 
{
	int i;
	Scanner in=new Scanner(System.in);
	System.out.println("enter any integer number");
	i=in.nextInt();
	short s=(short)i;
	System.out.println("value in short "+s);
	in.close();
}
}
