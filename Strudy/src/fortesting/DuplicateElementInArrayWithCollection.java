/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

import java.util.HashSet;
import java.util.Set;


public class DuplicateElementInArrayWithCollection {
    public static void main(String[] args) {
        
        int a[] = {4,1,7,3,0,6,9,0,5,4};

        Set h  = new HashSet<Integer>();
        
        for (int i = 0; i < a.length; i++) {
            
            h.add(a[i]);
            
        }
        
        for (Object object : h) 
        {
                System.out.print(object.toString()+",");
        }
    }
    
}
