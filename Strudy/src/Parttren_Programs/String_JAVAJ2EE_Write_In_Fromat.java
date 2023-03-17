/*
 J
J A
J A V
J A V A
J A V A J
J A V A J 2
J A V A J 2 E
J A V A J 2 E E
 */
package Parttren_Programs;

public class String_JAVAJ2EE_Write_In_Fromat {

    public static void main(String[] args) {

        String s = "JAVAJ2EE";
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print(ch[j]);

            }
            System.out.println("");

        }

    }
}
