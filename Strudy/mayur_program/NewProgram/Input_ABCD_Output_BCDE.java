package NewProgram;
public class Input_ABCD_Output_BCDE {
    public static void main(String[] args) {
       String s = "ABCD";
       char ch[] = s.toCharArray();
       int i = ch[0];
       int y =1;
        for (int j = 0; j < ch.length; j++) {
            int u = i + y;
           System.out.print((char)u);
            y++;
        }
    }
    
}
