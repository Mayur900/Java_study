package fortesting;

public class Reverse_String_With_Positions {

    public static void main(String[] main) {
        String s = "I Am Abhay Garhwal Student Of Ips Accedmey"; //output:- g ni rtS toNmAI
        String k = s.replaceAll("\\s", "");
        char allchar[] = k.toCharArray();
        char allwithspace[] = s.toCharArray();
        char ch1[] = new char[allwithspace.length];
        int j = allchar.length;
        for (int i = 0; i < allwithspace.length; i++) {
            j--;
            if (allwithspace[i] != ' ') {
                ch1[i] = allchar[j];
            } else if (allwithspace[i] == ' ') {

                ch1[i] = ' ';
                j++;
            }
        }
        for (int i = 0; i < ch1.length; i++) {

            System.out.print(ch1[i]);
        }
    }
}
