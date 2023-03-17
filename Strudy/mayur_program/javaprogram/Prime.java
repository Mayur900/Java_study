package javaprogram;

import java.util.Scanner;

//Prime Number
public class Prime
{
public static void main(String[] args) 
{
	int n,m,flag=0;
	System.out.println("Enter the number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	m=n/2;
	for(int i=2;i<m;i++)
	{
		if(n%i==0)
		{
			System.out.println(+n+" "+"is not prime");
			flag=1;
			break;
		}
	}

	if(flag==0)
	{
		System.out.println(+n+" "+"is prime");
	}
	in.close();
}
}
