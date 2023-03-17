package javaprogram;

public class ArraySort 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=20;
		a[1]=10;
		a[2]=4;
		a[3]=90;
		a[4]=70;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
