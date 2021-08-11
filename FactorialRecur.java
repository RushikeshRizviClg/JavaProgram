import java.util.*;
class FactorialRecur
{
 public static void main(String args[])
{
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the number:");
 int num = scanner.nextInt();
 int factorial = fact(num);
 System.out.println("Factorial of entered number is: "+factorial);
 }
 static int fact(int n)
 {
 if(n==1 || n==0)
{
 return 1;
 }
 return( n*fact(n-1));

 }
}