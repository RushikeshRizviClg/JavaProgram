import java.io.*;
class Caculatesdvc
{ public static void main(String[] args)
{ String s=new String();
int v=0, c=0, sp=0, d=0;
DataInputStream in= new DataInputStream(System.in);
try
{ System.out.println(" Enter string : ");
s=in.readLine();
}
catch (Exception e) { }
for(int i=0;i<s.length();i++)
if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
switch(s.charAt(i))
{
case 'a' :
case 'e' :
case 'o' :
case 'u' :
case 'i' :
case 'A' :
case 'E' :
case 'O' :
case 'U' :
case 'I' : v++; break;
default : c++;
}
else if(s.charAt(i)==' ')
sp++;
else
switch(s.charAt(i))
{ case '0' :
case '1' :
case '2' :
case '3' :
case '4' :
case '5' :
case '6' :
case '7' :
case '8' :
case '9' : d++;
}
System.out.println(s);
System.out.println(" No. of digits ="+d);
System.out.println(" No. of vowels ="+v);
System.out.println(" No. of constants ="+c);
System.out.println(" No. of space ="+sp);
}
}