package NewProgram;

public class Instance_Block {

    Instance_Block() {

        System.out.println("Consttor");
    }
        void  add()
        {
            System.out.println("method");
        }
        static 
        {
            System.out.println("Static block");
        }
    {
        System.out.println("Instance Block");
        add();
//        System.exit(0);
    }

    public static void main(String[] args) {
        new Instance_Block();
//        new Instance_Block(1);

    }

}
