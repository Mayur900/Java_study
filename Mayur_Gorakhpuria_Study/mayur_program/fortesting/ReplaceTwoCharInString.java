/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;


public class ReplaceTwoCharInString {
    
    public static void main(String[] args) {
        
    
    String s = "To change this license header, choose License Headers in Project Properties";
    
    String arr[] = s.split("\\s");
    
    String[] k = new String[arr.length];
    
    char c1 = 'o';
    char c2 = 'h';
    
    
        for (int i = 0; i < arr.length; i++)
        {
            char[] c = arr[i].toCharArray();
            int l = 0;
            for (int j = 0; j < c.length; j++) 
            {
                if(c[j] == c1 || c[j] == c2)
                {
                   l++; 
                   break;
                    
               }
           }
        if(l != 1)
        {
            k[i] = arr[i];
        }
            
        }
        for (String string : k) 
        {
        if(string !=null)
        {
            System.out.print(string+"\t");
        }
    }
   
    }   
}
