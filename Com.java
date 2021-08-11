/*
* This program is use of command line argument
*arguments as input
*/
class Com
{ 
	public static void main (String args[])
	{
		int count,i=0;
		String s;
		count=args.length;
		System.out.println("Number  of arguments ="+ count);
		while(i<count)
			{ 
				s=args[i];
				i++;
				System.out.println(i +" : "+ "Java is "+ s+" ! ");
			}
	}
}