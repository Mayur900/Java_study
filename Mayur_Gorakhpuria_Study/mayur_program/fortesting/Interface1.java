/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;


public interface Interface1 {

	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
	
	
       public class myclass implements Interface1
       {
           public static void main(String[] args) {
               
               myclass o = new myclass();
               o.log("str");
               
           }

        @Override
        public void method1(String str) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       }
	
}
    
    
    

