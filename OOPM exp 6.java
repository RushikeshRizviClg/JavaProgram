//EXPERIMENT NO.6
//Aim: Write a program to implement a Vector that accepts five items from the command line and store them in a Vector and display the Objects stored in a Vector. 

import java.util.*;
class Program
{
	public static void main(String args[])
	{
	int i;
	Vector v = new Vector();
	int len = args.length;
	for(i=0;i<len;i++)
	{
		v.addElement(args[i]);
	}
	int size =v.size();
	String str[]=new String[size];
	v.copyInto(str);
	for(i=0;i<len;i++)
	{
		System.out.print("elements of Vector : " +str[i]);
	}
  }
}
