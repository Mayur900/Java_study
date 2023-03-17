package javaprogram;

class Student
{
	public void demo()
	{
		System.out.println("in side Student Demo");
	}
}
public class Runtime extends Student
{
	public void demo()
	{
		System.out.println("in side main demo ");

	}
	public static void main(String[] args) 
	{
		Student  s=new Runtime();
		s.demo();
		Student s1=new Student();
		s1.demo();
	}
}
