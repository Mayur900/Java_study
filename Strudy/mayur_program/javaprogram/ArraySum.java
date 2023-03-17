
package javaprogram;

import java.util.Scanner;

public class ArraySum 
{
public static void main(String[] args) 
{
	int[] a=new int[6];
	int sum=0;
	System.out.println("print any 6 array element");
	Scanner in=new Scanner(System.in);
	for(int i=0;i<6;i++)
	{
		a[i]=in.nextInt();
	}
	for(int j=0;j<6;j++)
	{
		
		sum=sum+a[j];
	}
	System.out.println("sum of array is "+sum);
}
}
