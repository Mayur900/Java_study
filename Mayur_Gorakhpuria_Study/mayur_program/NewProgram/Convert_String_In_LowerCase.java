package NewProgram;

public class Convert_String_In_LowerCase {

    public static void main(String[] args) {
        String lowwer = "MAYUR";
        char ch[] = lowwer.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int y = 0;
            int asli = ch[i];
            for (int j = 65; j <= 90; j++) {
                y++;
                if (asli == j) {
                    break;
                }
            }
            int f = 96 + y;
            char ch1 = (char) f;
            System.out.print(ch1);

        }

    }

}
