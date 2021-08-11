EXPERIMENT NO.9
Aim:  Write a Program to find Area Of circle using Constructor Overloading.
import java.util.*;
class AreaOf
{
	double r;
	AreaOf()
	{
		r=0;
		
	}
	AreaOf(double radious)
	{
		r=radious;
	}
	AreaOf(int radious)
	{
		r=radious;
		
	}
	void display()
	{
		System.out.println("Area Of Circle="+(3.14*r*r));
	}
}
class FindArea
{
	public static void main(String args[])
	{
		double r1;
		int r2;
		Scanner sc = new Scanner(System.in);
		AreaOf a1 = new AreaOf();
		System.out.println("Enter radious 1");
		r1=sc.nextDouble();
		AreaOf b1 = new AreaOf(r1);
		System.out.println("Enter radious 2");
		r2=sc.nextInt();
		AreaOf c1 = new AreaOf(r2);
		System.out.println("Area Of circle--Radius=0");
		a1.display();
		System.out.println("Area Of Circle--Radius="+r1);
		b1.display();
		System.out.println("Area Of Circle--radius="+r2);
		c1.display();
		
	}
}
