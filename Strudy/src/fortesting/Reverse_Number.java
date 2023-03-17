
package fortesting;

public class Reverse_Number {
    public static void main(String[] args) {
        int s = 17868;
        int d = 0;
        int r = 0;
        while(s != 0)
        {
            d = s%10;
            r = (r*10)+d;
            s = s /10;
        }
        System.out.println(r);
        
    }
    
}
