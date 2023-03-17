package NewProgram;

public class Swap_Two_String_Variables {

    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "J2EE";

        s1 = s1 + s2;

        s2 = s1;

        System.out.println(s1.substring(s1.length()/2, s1.length()));
        System.out.println(s2.substring(0, s1.length()/2));
    }

}
