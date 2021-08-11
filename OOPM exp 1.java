//EXPERIMENT NO.1
//Aim: Write a Program to perform Menu Driven Arithmetic Operation.

import java.util.*;
import java.io.*;
	class Arithmetic
{
	  public static void main(String args[])throws IOException
	{
		int a ;
		int b;
		int choice;
		float e;
		float f;
		double c; 
		double d;
		System.out.println("1.Add");
 		System.out.println("2.sub");
		System.out.println("3.multiply");
		System.out.println("4.divide");
		System.out.println("5.modulus");

		DataInputStream di =new DataInputStream(System.in);
		InputStreamReader ob =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(ob);	
		Scanner sc =new Scanner(System.in);

		
		System.out.println("enter your choice:");
		choice= sc.nextInt();
		
		
		switch(choice)
		{
		case 1 : System.out.println("scanner class");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 System.out.println("a+b="+(a+b));
			 break;
			 
		case 2 : System.out.println("command line");
			 a=Integer.parseInt(args[0]);
			 b=Integer.parseInt(args[1]);
			 System.out.println("a-b="+(a-b));  
			 break;

		case 3 : System.out.println("DataInputStream");
			 e=Float.parseFloat(di.readLine());
			 f=Float.parseFloat(di.readLine());
			 System.out.println("e*f="+(e*f));
			 break;
			 
		case 4 : System.out.println("Buffered Reader");
			 c=Double.parseDouble(br.readLine());
			 d=Double.parseDouble(br.readLine());
			 System.out.println("c/d="+(c/d));
			 break;

		case 5 : System.out.println("Scanner class");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 System.out.println("a%b="+(a%b));
			 break;
		default:
		System.out.println("Invalid Input");
		}
          }
}