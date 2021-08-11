class Rectangle
{
	int length,width;
	Rectangle()
	{ 
		length=width=0;	
	}
	Rectangle(int l)
	{
		length=width=l;
	}
	Rectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		System.out.println(length*width);
	}
}
class ConstOverload
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10);
		Rectangle r3=new Rectangle(10,20);
		r1.area();
		r2.area();
		r3.area();
	}
}