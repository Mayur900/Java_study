
package Parttren_Programs;
/*
How many rows you want in Floyd's Triangle?
5
Floyd's Triangle : 
1   
2    3   
4    5    6   
7    8    9    10   
11   12   13   14   15
 */
public class Floyds_Triangle {
   public static void main(String[] args) 
    {
        
         
        int value = 1;
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+"\t");
                 
                value++;
            }
             
            System.out.println();
        }
    }    
    
}
