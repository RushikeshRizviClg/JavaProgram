//EXPERIMENT NO.5:
//08:44 PM 31-10-2017Aim: Write a Program to count frequency of  a given letter in a String.
import java.io.DataInputStream;// to load DataInputStream class
class CountLetter
{
 public static void main(String args[ ])
 {
String str = new String();
char ch='a';
int len,count=0;
DataInputStream in = new DataInputStream(System.in);
try
{
System.out.print("Enter String : ");
str = in.readLine(); // to read a string
System.out.print("Enter a character to be searched in string : ");
ch = (char)in.read(); // to read a single character
System.out.println(" String is : "+str);
}
catch(Exception e) { System.out.println("I/O Error"); }
 len = str.length(); //storing length of string in one variable
for(int i =0;i<=len-1;i++)
 if(ch==str.charAt(i))//comparing character with each element of array
count++; // incrementing count variable
System.out.println(" Frequency of character '"+ch+"' in string is "+count);
 }
}
