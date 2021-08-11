class StaticDemo1
{
static int a = 5;
static int b;
static void display(int c)
{
System.out.println(" a = "+a);
System.out.println(" b = "+b);
System.out.println(" c = "+c);
}
static
{
System.out.println(" static block initialized....");
b = a * 5;
}
public static void main(String args[])
{
display(40);
}
}