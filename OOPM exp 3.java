import java.util.*;
class add
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,s,flag=0;
		int a[]=new int[15];
		System.out.println("enter the size of array");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter the number");
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the number to be found");
		s=sc.nextInt();
		flag=linear(a,n,s);
		if(flag==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
	}
	static int linear(int a[],int n, int s)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(s==a[i])
			break;
			return 1;
		}
		return 1;
	}	
}