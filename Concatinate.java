import java.io.*;
class Str2
{
public static void main(String args[]) throws IOException
{
boolean n ;
DataInputStream in= new DataInputStream(System.in);
String s,s1,s2=new String();
System.out.println(" Enter string : ");
s=in.readLine();
s1=in.readLine();
n=s.equalsIgnoreCase(s1);
if(n==true)
{
s2=s.concat(s1);
System.out.println(s2);
}
else
System.out.println("error");
}
}