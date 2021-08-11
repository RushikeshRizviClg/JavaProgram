import java.io.*;
class LargestTernary
{
public static void main(String[] args)
{
int x,y,z,temp;
DataInputStream input=new DataInputStream(System.in) ;
try
{
System.out.println("Enter the First number");
x=Integer.parseInt(input.readLine());
System.out.println("Enter the Second number");
y=Integer.parseInt(input.readLine());
System.out.println("Enter the Third number");
z=Integer.parseInt(input.readLine());
temp=x>y?x:y;
temp=temp>z?temp:z;
System.out.println("Largest among three numbers "+x +" , "+y+" & "+z+" is "+temp);
}
catch(Exception e)
{ System.out.println("Entered wrong value"); }
}
}