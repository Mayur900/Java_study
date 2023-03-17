
package fortesting;


public class Replace_1_With_0_Without_If_And_Switch {
    public static void main(String[] args) {
        
         int arr[]={1,0,0,0,1,1,0,1,0};
         int a[] = new int [arr.length];
         
         for (int i = 0; i < arr.length; i++)
         {
             a[i] = arr[i]^1;
         }
        
         for (int i : a) {
            
        
         System.out.print(i+",");
    }
    }
}
