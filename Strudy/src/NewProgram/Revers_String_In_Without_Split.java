package NewProgram;

public class Revers_String_In_Without_Split {

    public static void main(String[] args) {

        String s = "This is java"; // op: - java is this
        char ch[] = s.toCharArray();
        String se = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            if (!Character.isWhitespace(ch[i])) {
                se = se.concat(Character.toString(ch[i]));
            }
            if (Character.isWhitespace(ch[i]) || i == 0) {
                char nch[] = se.toCharArray();
                for (int j = nch.length - 1; j >= 0; j--) {
                    System.out.print(nch[j]);
                }
                System.out.print(" ");
                se = "";
            }
        }
    }
}
