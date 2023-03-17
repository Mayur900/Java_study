package NewProgram;

import java.io.IOException;

class Check_IP_Address_Foramt_validOrNot {

    public static void main(String[] args) throws IOException {

        String line = "255.255.255.0";
        String g[] = line.split("\\.");
        boolean out = false;
        for (int i = 0; i < g.length; i++) {

            int f = Integer.parseInt(g[i]);
            if (g[i].length() <= 3) {
                if (f >= 0 && f <= 255) {
                    out = true;
                } else {
                    out = false;
                    break;
                }
            } else {
                out = false;
                break;
            }
        }
        if (out == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
