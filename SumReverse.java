import java.io.*;
class SumReverse
{
public static void main(String args[])
{
int number , temp , sum = 0 ;
// creating object of class DataInputStream.
 DataInputStream in = new DataInputStream(System.in);
try
{
System.out.print("Enter the Number :");
number = Integer.parseInt(in.readLine());
int og=number;
do
{
temp = number % 10 ;
System.out.print(temp);
sum = sum + temp ;
number = number / 10 ;
}
while (number != 0) ;
}
catch(Exception e) { System.out.println("I/O Error"); }
System.out.println("\n The sum of individual digits is "+sum);
}
}