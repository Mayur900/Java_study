package NewProgram;
public class MaxAndSecoundMaxInArray
{
    public static void main(String[] args) {
        int[] n = {3,9,1,15,6,7,8,2,13};
        
        int max = n[0];
        int smax = n[0];
        for (int i = 0; i < n.length; i++)
        {
        if(n[i]>max)
        {
            smax = max;
            max = n[i];
            
            
        }
        else if(n[i] > smax)
        {
            smax = n[i];
        }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
}
