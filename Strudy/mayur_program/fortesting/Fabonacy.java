
package fortesting;


public class Fabonacy {
    public static void main(String[] args) {
        int  n = 20;
        int f1=-1;
        int f2 =1;
        int f3 = 0;
        
           for (int i = 0; i < n; i++) 
           {
               
            f3 = f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            
        }
           
        
        
    }
    
}
