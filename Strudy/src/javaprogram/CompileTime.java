package javaprogram;

public class CompileTime 
{
public int test(int a,int b)
{
	System.out.println("int method");
	return a+b;
}
public float test(float a,float b)
{
	System.out.println("float method");
	return a+b;
}
public double test(double a,double b)
{
	System.out.println("double method");
	return a+b;
}
public long test(long a,long b)
{
	System.out.println("long method");
	return a+b;
}
public static void main(String[] args)
{
	CompileTime c=new CompileTime();
	System.out.println(c.test(10, 20));
	System.out.println(c.test(2.0, 4.0));
	System.out.println(c.test(24f, 45f));
	System.out.println(c.test(21l, 78l));
}
}
