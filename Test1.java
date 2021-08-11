/*
constructor overloading

*/import java.util.*;
class Rectangle
{
	int length,width;
	Rectangle()
	{ 
		length=width=10;	
	System.out.println((length*width));
	}
	Rectangle(int l)
	{
		length=width=l;
	System.out.println(length*width);
	}
	Rectangle(int l,int w)
	{
		length=l;
		width=w;
	System.out.println(length*width);
	}
	
}
class Test1
{
	public static void main(String args[])
	{	
		int l,w;
		Scanner cs = new Scanner (System.in);
		System.out.println("Enter length and width :=");
		l=cs.nextInt();
		w=cs.nextInt();
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(l);
		Rectangle r3=new Rectangle(l,w);
	
	}
}