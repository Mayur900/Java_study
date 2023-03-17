
package fortesting;


class Student implements Cloneable{
int rollno;
String name;
static int c;

   



Student(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
c++;
}

public Object clone()throws CloneNotSupportedException{
return super.clone();
}

public static void main(String args[]) throws CloneNotSupportedException{
try{
Student s1=new Student(101,"amit");

Student s2=(Student) s1.clone();

System.out.println(s1.rollno+" "+s1.name);
System.out.println(s2.rollno+" "+s2.name);
    System.out.println(c);

}
catch(CloneNotSupportedException c){}

}
}

    
    
    

