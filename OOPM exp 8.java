//EXPERIMENT NO.8
//Aim: Write a Program to  find Area Of circle using Method Overloading.
import java.util.*;
class AreaOfMethodOverload
{
	double r;
	void areaCircle()
	{
		r=5;
	}
	void areaCircle(double radious)
	{
		r=radious;
		
	}
	void areaCircle(int radious)
	{
		r=radious;
	}
	void display()
	{
		System.out.println("Area Of circle:"+(3.14*r*r));
		
	}
}
	class FindAreaOverload
	{
	public static void main(String []args)
		{
			double r1;
			int r2;
			Scanner sc = new Scanner(System.in);
			AreaOfMethodOverload a = new AreaOfMethodOverload();
			a.areaCircle();
			System.out.println("Enter radious 1");
			r1=sc.nextDouble();
			AreaOfMethodOverload b = new AreaOfMethodOverload();
			b.areaCircle(r1);
			System.out.println("Enter radious 2");
			r2=sc.nextInt();
			AreaOfMethodOverload c = new AreaOfMethodOverload();
			c.areaCircle(r2);
			System.out.println("Area of circle----radius=5");
			a.display();
			System.out.println("Area Of circle--radius="+r1);
			System.out.println("Area of circle="+r2);
			c.display();
			
		}
	}
