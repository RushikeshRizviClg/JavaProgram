//09:03 PM 31-10-2017EXPERIMENT NO.13
//Aim: Write a Program to demonstrate user Defined exception in java.
import java.util.*;
class Month
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month number:");
n=sc.nextInt();
try
{
if(n>12||n<1)
throw new ArithmeticException();
System.out.println("Month number entered is="+n);
}
catch(ArithmeticException ae)
{
System.out.println("Invalid Number!");
}
}
}
