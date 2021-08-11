import java.io.*;
abstract class Shape
{
 abstract void draw();
}

 //In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape
{ int l,w;
Rectangle() throws IOException
{ DataInputStream in=new DataInputStream(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******Rectangle******");
System.out.println("Enter Length and width of Rectangle");
l=Integer.parseInt(in.readLine());
w=Integer.parseInt(in.readLine());
}
 void draw()
{
System.out.println("Area of Rectangle = "+(l*w));
}
}
class Circle extends Shape
{ double r;
Circle() throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("******Circle******");
System.out.println("Enter Radius of a Circle");
r=Double.parseDouble(in.readLine());
}
 void draw()
{
System.out.println("Area of Circle = "+(0.5*r*r));
}
}
 //In real scenario, method is called by programmer or user
class Area_Abstraction
{
 public static void main(String args[]) throws IOException
{
Circle c=new Circle();
c.draw();
Rectangle d=new Rectangle();
 d.draw();
 }
}
