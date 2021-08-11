import java.io.DataInputStream;
class Object1
{
public static void main (String args[])
 {
float a=0, t;
double s;
DataInputStream in = new DataInputStream(System.in);
System.out.print("\n Enter value of a : ");
try
{
a=Float.parseFloat(in.readLine());
}
catch (Exception e)
{
System.out.println("I/O Error");
}
System.out.println ("a: "+a);
System.out.println("S T ");
t=1;
 s=0.5*a*t*t;
System.out.println(s+"\t"+t);
for (t=5;t<=100;t=t+5)
{
s=0.5*a*t*t;
System.out.println(s+"\t"+t);
}
}