/*
String : computer
c
co
com
comp
compu
comput
compute
computer
 */
package Parttren_Programs;

public class Generate_pattern {

    public static void main(String[] args) {
        String s = "computer";
        char ch[] = s.toCharArray();
        int g = 1;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch[j]);
                g++;
            }
            System.out.println("");
        }
    }
}
