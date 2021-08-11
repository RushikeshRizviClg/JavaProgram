/*
*
*/
class  While
{ 	
	public static void main(String args[])
	{
		StringBuffer s =new StringBuffer();
		char c;
		System.out.println("Enter a string :");
		try
		{	while( (c = (char)System.in.read() )  != '\n')
			{
				s.append(c);   //append charater
			}
		}
		catch(Exception e)
		{	
			System.out.println("Eoor input");
		}
	System.out.println("You have entered .......\t"+ s);
	}
}