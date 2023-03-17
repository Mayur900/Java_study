/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;


public class MutableString {
    
    public static void main(String[] args) {
        
//        
//        String s = new  String("mayur");
//        s="raj";
//        String s1 = "mayur";
////        String s2 = "mayur";
//        Integer i = 50;
//        Integer j = 51;
//        Integer k = new Integer(50);
//        int h = 5;
//        StringBuffer p = new StringBuffer("mayur");
//        p.append(9);
//        
//        String s3="Sachin";  
//         String s4="Sachin";  
//   String s5=new String("Sachin");  
//   System.out.println(s3==s4);//true (because both refer to same instance)  
//   System.out.println(s3==s5);//false(because s3 refers to instance created in nonpool)  
//        System.out.println(s3.equals(s5));
////        System.out.println(s);
////        System.out.println(p);
////        
//        System.out.println(i == j);
//        
//        System.out.println(i.equals(j));
////////        System.out.println(i == h);
//        System.out.println(i.equals(k));
//        System.out.println(i == k);
////        
        
        String s = new String("mayr");
        s =  s.concat("raj");
        StringBuffer s1 = new StringBuffer();
        s1.append("mayur");
        s1.append("raj");
        
        
        System.out.println(s);
        System.out.println(s1);
    
    }
    
}
