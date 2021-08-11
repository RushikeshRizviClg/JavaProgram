import java.io.*;
class Triangle1
{
public static void main(String[] args)
{
int i,j,c=1;
DataInputStream in=new DataInputStream(System.in);
try
 {
 System.out.print("enter number=");
 int number=Integer.parseInt(in.readLine());
 for (i=1;i<=number ;i++ )
 {
 for (j=1;j<=i ;j++ )
 {
 if (c==10)
 {
 System.out.print("\t"+0);
c++;
 }
 else
 {
 System.out.print("\t"+c++);
 }
 }
 System.out.println();
 }
 }
catch (Exception e)
{System.out.println("This is not a number");}
}
}