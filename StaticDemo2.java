class StaticDemo
{
static int i = 1;
static int j = 5;
static void display( )
{
System.out.println(" i = "+i);
}
}
class StaticDemo2
{
public static void main(String args[])
{
StaticDemo.display();
System.out.println(" j = "+StaticDemo.j);
}
}