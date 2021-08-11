import java.io.*;
class Frequency
{	
	public static void main (String args[])
	{	
		int n,i,count=0;
		DataInputStream in = new DataInputStream(System.in);
		String str =new String();
		char ch='k';

		System.out.println("Enter string");
		try
		{	str =in.readLine();
		}
		catch(Exception e)
		{	System.out.println(e);
		}
		n=str.length();
		char c[] = new char[n];
		c=str.toCharArray();
		System.out.println("Enter string");
		try
		{
			ch=(char) in.read();
		}
		catch(Exception e)
		{	System.out.println(e);
		}	
		System.out.println("Enter character");
		for(i=0;i<=n-1;i++)
		{ 
				if(ch==str.charAt(i))
			
			
			
		
				{count++;}
		}		
		System.out.println(count);
	}
}