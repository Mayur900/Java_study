/*
 String numberAsString = "11111111";
int number1 = Integer.valueOf(numberAsString, 2);
int number2 = Integer.parseInt(numberAsString, 2);
System.out.println(number1);
System.out.println(number2);
 */
package fortesting;

public class BinaryToDecimal 
{
   public  final static void main(String[] args)
    {
        String s = "1001";
         Integer k[] = new Integer[s.length()];
        int o = Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++)
        {
            k[i]=o%10; 
            o=o/10;
        }
        Integer t[] = new Integer[s.length()];
        int h= 0;
        for (int i = 1;; i*=2)
        {
            if(h>s.length()-1)
               break;
           t[h] = i;
           h++;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
        if(k[i] == 1)
        {
            sum += t[i]; 
        }
            
        }
        System.out.println(sum);
    }
   
}
