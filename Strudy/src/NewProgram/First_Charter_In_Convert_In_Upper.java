package NewProgram;

public class First_Charter_In_Convert_In_Upper {

    public static void main(String[] args) {
        String s = "this is java"; // op:- This Is Java
        char ch[] = s.toCharArray();
        String se = "";
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isWhitespace(ch[i])) {
                se = se.concat(Character.toString(ch[i]));
            }
            if (Character.isWhitespace(ch[i]) || i == ch.length - 1) {
                char nch[] = se.toCharArray();
                for (int j = 0; j < nch.length; j++) {
                    if (j == 0) {
                        System.out.print(Character.toUpperCase(nch[j]));
                    } else {
                        System.out.print(nch[j]);
                    }
                }
                System.out.print(" ");
                se = "";
            }
        }
    }
}
