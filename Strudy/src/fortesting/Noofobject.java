/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

/**
 *
 * @author Mayur
 */
public class Noofobject  implements Cloneable{
public static int count=0;
    public Noofobject() {
        System.out.println("call");
        System.out.println("count::"+count);
        count++;
    }
    
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Noofobject n1= new Noofobject();
        Noofobject n12= new Noofobject();
        
        Noofobject n2=(Noofobject)n1.clone();
        
                
        System.out.println(n2.equals(n1));
        System.out.println(n2);
    }
    
}
