package Parttren_Programs;
/**
   1 
  2 2 
 3 3 3 
4 4 4 4 
 3 3 3 
  2 2 
   1 
 */
public class Patren25 {
    public static void main(String[] args) {
        int y = 0 ;
        for (int i = 1; i <=4; i++)
        {   
            y++;
            for (int j = i; j <=4; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        int g =1;
        for (int i = 3; 1 <= i; i--) {
            y--;
            g++;
            for (int j = 1; j <= g; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }  
}
