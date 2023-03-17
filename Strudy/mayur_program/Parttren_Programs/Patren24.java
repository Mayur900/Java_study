package Parttren_Programs;
/**
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
 */
public class Patren24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <=4; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        int y = 2;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(" ");
            }
            y++;
            for (int j = i; j <= 3; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
            
        }
        
    }
    
}
