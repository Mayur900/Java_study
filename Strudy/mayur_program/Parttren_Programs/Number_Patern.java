package Parttren_Programs;
/**
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
public class Number_Patern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print(j);
                System.out.print("-");
            }
            if(i == 2 || i == 3){
            for (int j = 1; j <= 1; j++) {
                System.out.print(j);
                System.out.print("-");
            }
            }
            System.out.println("");
        }
    
    }
    
}
