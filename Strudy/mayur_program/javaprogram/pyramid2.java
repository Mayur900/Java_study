package javaprogram;
/*      $            
       $  $         
      $  $  $      
     $  $  $  $   
    $  $  $  $  $ 
*/
public class pyramid2 
{
public static void main(String[] args) 
{
	int i,j,k,temp=5;
	for(i=1;i<=5;i++)
	{
		for(k=temp;k>=1;k--)
		{
			System.out.print(" ");
		}
		for( j=1;j<=i;j++)
		{
			System.out.print("$ ");
			
		}
		System.out.println();
		temp--;
	}
}
}
