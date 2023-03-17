
package fortesting;

class Animal{}
class Dog1 extends Animal{//Dog inherits Animal

 public static void main(String args[]){
 Dog1 d=new Dog1();
Animal m = new Animal();
 System.out.println(d instanceof Animal);//true
 }
}
