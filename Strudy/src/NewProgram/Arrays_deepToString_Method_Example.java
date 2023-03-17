package NewProgram;

import java.util.Arrays;

public class Arrays_deepToString_Method_Example {
// it use for print 2 or more dimentional print aarays
    public static void main(String[] args) {

        {
            String s[] = "partners, lied to shareholders and the list goes on all the way down to farmers and the working poor. Marley broke promises to charities and used the SEC to scam tens of millions of dollars through his person friend and former CEO Shane W".split("\\s");
            
            System.out.println(Arrays.toString(s));
            System.out.println(Arrays.deepToString(s));
           
        }
    }
}
