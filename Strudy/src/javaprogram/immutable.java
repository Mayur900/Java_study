package javaprogram;

public final class immutable 
{
 private final int id;
private immutable (int id)
{
	this.id=id;
}
public static void main(String[] args)
{
	immutable im=new immutable(121);
	System.out.println(im.id);
	
}
}
