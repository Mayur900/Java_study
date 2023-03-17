
package NewProgram;

public class SuperConsterctorAuto {

    public SuperConsterctorAuto() {
        System.out.println("Super Constoctore");
        System.out.println(this.hashCode());
    }
    
}
class Child extends SuperConsterctorAuto
{

    public Child() {
        System.out.println("Child class Constter");
        System.out.println(this.hashCode());
    }
    
}
class test
{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.hashCode());
    }
}
