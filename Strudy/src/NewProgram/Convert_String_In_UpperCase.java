package NewProgram;

public class Convert_String_In_UpperCase {

    public static void main(String[] args) {
        String s = "mayur";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            int aski = ch[i];
            int y = 0;
            for (int j = 97; j <= 123; j++) {
                y++;
                if (aski == j) {
                    break;
                }

            }
            int f = 64 + y;
            char r1 = (char) f;
            System.out.print(r1);

        }

    }

}
