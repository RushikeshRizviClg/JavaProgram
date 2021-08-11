//EXPERIMENT NO.2:
//Aim: Write a Program to Print Following Pattern.
	*
	* *
	* * * 
	* * * *
	* * * * *
	
	class Jump
{
	public static void main(String args[])
	{
		int i,j;
		second:
		for(i=1;i<=10;i++)
		{
			if(i>6)
			break second;
			first:
		for(j=1;j<=10;j++)
		  {
			if(j>i)
			continue first;
			System.out.print("*");
		   }
		System.out.println(" ");
		 }
	}
}
