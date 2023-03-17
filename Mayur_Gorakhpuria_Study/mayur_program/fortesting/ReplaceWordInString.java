/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

public class  ReplaceWordInString 
{
public static void main(String[] args)
{
       String myName = "mayur gorakhpuria mayur";
        String [] k = myName.split("\\s");
        String o =  "raj";
        
        for (int i = 0; i < k.length; i++) 
        {
             if(k[i].equals("mayur"))
             {
                 k[i] = o;
             }
        }
        
        for (String string : k) 
        {
        System.out.print(string+" ");
        }
        
    }
}



