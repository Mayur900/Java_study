package fortesting;

public class MissingNumber
{
    
    public static void main(String[] args) {
        
        int[] n = {1,2,3,4,5,7,8,9,10};  
       int l = 0;
        
        for (int j = 0; j < n.length; j++) {
            
             l += n[j];
            
        }
        System.out.println(l);
        
    int  total  = (n.length+1)*(n.length+2)/2; 
        System.out.println(total);
    for (int  i = 0; i< n.length; i++)
    {
       total -= n[i];
    }
   
        System.out.println(total);
    }
    
    
}
