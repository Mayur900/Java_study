package fortesting;
public class EvenOddWithoutArithmetic 
{

    public static void main(String[] args) 
    {
    
        int a = 9;
       int i = (a & 1);
        if((a & 1) == 0)
        {
            System.out.println("even");
            
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}
