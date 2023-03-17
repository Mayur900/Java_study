package Parttren_Programs;
/**
   * 
  * * 
 *   * 
*     * 
 *   * 
  * * 
   * 
 */
public class Patren26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            
            for (int j = i; j <= 6; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <=1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("-");
            }
            if(i>1){
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            }
            System.out.println("");
            //i--;
        }
    }
}
