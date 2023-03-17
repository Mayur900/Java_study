package Parttren_Programs;
/**
     0
    101
   21012
  3210123
 432101234
54321012345
 */
public class Patren27 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            int t = i;
            for (int j = t; 0 <= j; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= t; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    } 
}
