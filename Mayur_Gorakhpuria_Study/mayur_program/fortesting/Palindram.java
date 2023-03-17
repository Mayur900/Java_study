/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;


public class Palindram 
{
    public static void main(String[] args) {
        
    
    int n = 121;
    int m = n;
    int d,r = 0;
    while(n != 0)
    {
         d = n%10;
         r = (r*10)+d;
        n = n/10;
    }
    
    if(m==r)
    {
        System.out.println("palindram");
    }
    else
    {
        System.out.println("not");
    }
    }
}
