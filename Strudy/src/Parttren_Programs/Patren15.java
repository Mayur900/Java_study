package Parttren_Programs;

/**
 * 1111111
 * 1111122
 * 1111333
 * 1114444
 * 1155555
 * 1666666
 * 7777777
 */
public class Patren15 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 7; i++) {
            int y = i;
            for (int j = i; j < 7; j++) {
                System.out.print("1");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

}
