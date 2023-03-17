/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

public class Charterreplcae {

    public static void main(String[] args) {

        String myName = "domanokz";
        char[] myNameChars = myName.toCharArray();
        
        for (int i = 0; i < myNameChars.length; i++) 
        {
             if('o' == myNameChars[i])
             {
                 myNameChars[i] = 'p';
             }
        }
        myName = String.valueOf(myNameChars);
        
        System.out.println(myName);
    }

}
