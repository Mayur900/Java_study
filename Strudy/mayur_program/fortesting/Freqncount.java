
package fortesting;
public class Freqncount {
    public static void main(String[] args) {
        int count;
        int a[] = {1,2,3,2,3,4,3,6,5,4,6,4,8,8,5,6,3,2};
       
        
        for (int i = 0; i < a.length; i++)
        {
            count= 0;
            int t = a[i];
            for (int j = 0; j < a.length; j++)
            {
               if(t == a[j])
                {
                    count++;
                    a[j] = 0;
                }
            }
            if(t != 0)
            System.out.println(t+":-"+count);
            
        }
         
            
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int count = 0;
//        HashMap<Integer,Integer> y = new HashMap<>();
//        for (int i = 0; i < a.length; i++)
//        {
//          count = 0;
//            int temp = a[i];
//            
//            for (int j = i; j < a.length; j++) 
//            {
//                {
//                    
//             if(temp == a[j])
//                    {
//                        count++;
//                    }
//                }
//             }
//             y.putIfAbsent(temp, count);
//    }
//    
//        
//        for (Map.Entry<Integer, Integer> entry : y.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//
//              System.out.println(key+":-"+value);
//
//            
//        }
//        
//            
        }
    }

