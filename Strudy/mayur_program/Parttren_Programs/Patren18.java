package Parttren_Programs;
/**
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */
public class Patren18 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            
            for (int j = 10-i; 1 < j; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
       
    }
}
