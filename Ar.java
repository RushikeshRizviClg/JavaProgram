import java.io.*;
import java.util.*;
class Ar
{
	public static void main(String args[]) throws IOException
	{
		int x,y,choice;
		DataInputStream in = new DataInputStream(System.in);
		Scanner sc =new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(r);
		System.out.println("\n\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN ARITHMATIC OPERATION : \n\n "); System.out.println("\n\t\tMENU\n");
		System.out.println("\t 1. Addition \n");
		System.out.println("\t 2. Subtraction \n");
		System.out.println("\t 3. Division \n");
		System.out.println("\t 4. Multiplication \n");
		System.out.println("Enter your choice :");
		choice=Integer.parseInt(in.readLine());
		switch (choice)
		{
			case 1 : System.out.print("Input through DataInputStream :\n\n");
				System.out.print("Enter First Number :");
				x=Integer.parseInt(in.readLine());
				 System.out.print("Enter Second Number :");
				y =Integer.parseInt(in.readLine());
				System.out.println("Addition of "+x+" and "+y+" : "+(x+y));
				break ;

			case 2 : System.out.print("Input through Scanner :\n\n");
				System.out.print("Enter First Number :");
				x =sc.nextInt();
				System.out.print("Enter Second Number :");
				y =sc.nextInt();
				System.out.println("Subtraction of "+x+" and "+y+" : "+(x-y));
				break ;

			case 3 : System.out.print("Input through BufferedReader :\n\n");
				System.out.print("Enter First Number :");
				x=Integer.parseInt(br.readLine());
				 System.out.print("Enter Second Number :");
				y=Integer.parseInt(br.readLine());
				System.out.println("Division of "+x+" and "+y+" : "+((float)x/(float)y));
				break ;

			case 4 : System.out.print("Input through Scanner :\n\n");
				System.out.print("Enter First Number :");
				x =sc.nextInt();
				System.out.print("Enter Second Number :");
				y =sc.nextInt();
				System.out.println("Multiplication of "+x+" and "+y+" : "+(x*y));
				break ;

			default :System.out.println("Wrong choice !!");
	}
}
}