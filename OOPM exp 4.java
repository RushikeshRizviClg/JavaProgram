EXPERIMENT NO.04

Aim: Write a Program to Perform Matrix Addition.

import java.util.*;
class Matrixadd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j;
System.out.println("Enter matrix A");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Matrix A is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t"); 
}
System.out.println();
}
System.out.println("Enter matrix B");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("Matrix B is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"\t");
} 
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
} 
}
System.out.println("Sum of matrix is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{ 
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
 }
