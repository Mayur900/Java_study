/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewProgram;
//{
// abstract void add() throws FileNotFoundException;
// synchronized final void sub() throws FileNotFoundException
//{
//    System.out.println("");
//}
//}

 class A{
    A(int a)
    {
        System.out.println("class a");
    }
}
class B extends A
{
    B(int b)
    {
        super(b);
        System.out.println("class b");    
    }
}
class Constrctore_Example extends B
{
    Constrctore_Example(int c)
    {
        super(c);
            System.out.println("class c");
    }
    
    public static void main(String[] args) {
        Constrctore_Example c = new Constrctore_Example(5);
    }
}