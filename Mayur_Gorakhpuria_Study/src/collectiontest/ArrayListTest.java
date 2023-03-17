package collectiontest;

public class ArrayListTest {
	import java.util.ArrayList;

import arrayListTestNew.Coustmer;
import arrayListTestNew.Employee;
import arrayListTestNew.Student;
import arrayListTestNew.a;

	public class TestNew {

	public static void main(String []args) {
ArrayList a = new ArrayList<>();            ArrayList a1 = new ArrayList<>();    
		Employee e = new Employee();           	  Employee e1 = new Employee();
		e.setId(01);												  e1.setId(02);
		Coustmer c = new Coustmer();              Coustmer c1 = new Coustmer();        
		c.setName("Abhay");                                c1.setName("Abhay");
		Student  s = new Student ();                    Student  s1 = new Student ();
		s.setPost("Worker");                                   s1.setPost("Worker");
		
		/*a.add(e);         a1.add(e1);      a.addAll(a1);
		a.add(s);         a1.add(s1);       
		a.add(c);         a1.add(c1);*/
		a.add(e);

		//System.out.println(e.getId());        
		//System.out.println(e1.getId());
		
		//System.out.println(e.toString());
		//e1.setId(02);
		System.out.println(a.contains(s1)); 
		
		//a.add(0, e1); 
		a.set(0, e1);
		//System.out.println(a.contains(e));
		System.out.println(e.getId());
		System.out.println(a.contains(e1)); // mujhe replace value ko print karvana he 
		System.out.println(a.set(0, e1));
		System.out.println(a.);
		
		
	}
	}

}
