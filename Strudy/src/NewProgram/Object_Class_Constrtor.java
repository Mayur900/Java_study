
package NewProgram;


public class Object_Class_Constrtor extends Object{

    public Object_Class_Constrtor() {
        super();
        System.out.println(this.hashCode());
    }
    public static void main(String[] args) {
        Object_Class_Constrtor of = new Object_Class_Constrtor();
        System.out.println(of.hashCode());
        
    }
}
