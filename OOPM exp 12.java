//EXPERIMENT NO.12:
//Aim: Write a Program to implement Interface  demonstratating the concept of Multiple Inheritance.
class Student
{
int rollNumber;
void getNumber(int n)
{
rollNumber=n;
}
void printNumber()
{
System.out.println("RollNo is " +rollNumber);
}
}
class Test extends Student
{
float part1,part2;
void getMarks(float a, float b)
{
part1=a;
part2=b;
}
void putMarks()
{
System.out.println("Marks Part1 "+part1);
System.out.println("Marks Part2 "+part2);
}
}
interface Sports
{
float sportwt=6.0F;
void putwt();
}
class Results extends Test implements Sports
{
float total;
public void putwt()
{
System.out.println("Sports Marks "+ sportwt);
}
void display()
{
total=part1+part2+sportwt;
System.out.println("Total marks of " +rollNumber+" is "+total);
}
}
class MainClass
{
public static void main(String srgs[])
{
Results a=new Results();
a.getNumber(10);
a.printNumber();
a.getMarks(10.0F,25.5F);
a.putMarks();
a.putwt();
a.display();
}
}
