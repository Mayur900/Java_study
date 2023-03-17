
package fortesting;

import java.text.DecimalFormat;


public class DoublesValue {
    public static void main(String[] args) {
        
        double d = 4.0;
        
        
        DecimalFormat  dc  = new DecimalFormat("##.#####");
//        double g = Math.round((d /23.0)*100.00)/100.0;
//        double k =   (int)Math.round((d /23.0) * 100)/(double)100;
         double l = (d/23.0);
//        


       double number = (d/23.0);
        number = (Math.round(number * 100000));
        number = number / 100000;
        System.out.println(number);
       



         
        double p = ((Math.round(l * 100000))/10000);
        //number = number / 100000;
        System.out.println(+ p);
         
        double r = Double.parseDouble(dc.format(l));
         
       
         
//        System.out.println(g);
        System.out.println(l);
        System.out.println(r);
        
    }
    
}
