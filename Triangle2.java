import java.io.*;
class Triangle2
{
public static void main(String[] args)
{ int i,j,c=10;
DataInputStream input=new DataInputStream(System.in);
try
 {
 System.out.print("enter number=");
 int number=Integer.parseInt(input.readLine());
 for (i=number;i>0;i--)
 {
 for (j=1;j<=i ;j++ )
 {
 if (c==10)
 {
 System.out.print("\t"+0);
 c--;
 }
 else
 {
 System.out.print("\t"+c--);
 }
 }
 System.out.println();
 }
 }
catch (Exception e)
{ System.out.println("This is not a number"); }
}
}