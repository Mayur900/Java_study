package javaprogram;

import java.util.Scanner;

public class AvgNumber 
{
public static void main(String[] args) 
{
	int n;
	double  avg=0,temp,sum=0;
	System.out.println("enter any number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	System.out.println("plz enter any "+n+" number");
	for(int i=1;i<=n;i++)
	{
		temp=in.nextDouble();
		sum=sum+temp;
	}
	avg=sum/n;
	System.out.println("avg is = "+avg);
}
}
