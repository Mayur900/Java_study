/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

public class Armstron 
{
    public static void main(String[] args) {
        
        int n = 153;
        int sum=0;
        int d=0;
        while (n!=0) 
        {            
        
            d = n%10;
            sum += (d*d*d);
            n = n/10;
        }
        
        System.out.println(sum);
    }
}
