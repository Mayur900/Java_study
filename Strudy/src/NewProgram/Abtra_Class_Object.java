package NewProgram;
abstract class f
{

    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
        asuh();
    }
    f()
    {
        
    }
    static  void asuh()
    {
        System.out.println("gd");
    }
   abstract void add();
    public static void main(String[] args) {
        System.out.println("fa");
    }
}

public class Abtra_Class_Object {

    public static void main(String[] args) {
        f a = new f() {
            @Override
            void add() {
           
            }
        }; 
        
}
}
