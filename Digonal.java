import java.io.*;
class Diagonal
{ public static void main(String[] args)
{ int array[][];
int d1=0,d2=0,i,j,r,c;
DataInputStream in = new DataInputStream(System.in);
try{
do
{ System.out.println("Enter number of rows ");
 r=Integer.parseInt(in.readLine());
 System.out.println("Enter number of column ");
 c=Integer.parseInt(in.readLine());
}
while ((r<0 )|| (c<0) );
if(r==c)
{
System.out.println("This is a diagonal matrix");
System.out.println("Enter elements of a matrix");
array=new int[r][c];
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
array[i][j]=Integer.parseInt(in.readLine());
if(i==j)
d1+=array[i][j];
if(i+j==r-1)
d2+=array[i][j];
 }
 }
System.out.println();
 System.out.println(" MATRIX ");
 for(i=0;i<r;i++)
 {
 for(j=0;j<c;j++)
System.out.print(array[i][j]+"\t");
System.out.println();
 }
System.out.println("Sum of the Diagonal elements from TOP
LEFT to BOTTOM RIGHT: "+d1);
System.out.println("Sum of the Diagonal elements from TOP
RIGHT to BOTTOM LEFT: "+d2);
}
 else
System.out.println(" NOT a Diagonal matrix");
} catch(Exception e) { System.out.println(" I/O error ");}
}}