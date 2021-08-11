/*Reading from keyboard
* by DataInputStream
*/
import java.io.DataInputStream;
class Read
{
	public static void main(String args[])
	{
		DataInputStream in = new DataInputStream(System.in);
		int n=0;
		float f=0.0f;
		try		
		{	System.out.println("Enter an Integer  :");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enrter a Float number :");
			f = Float.parseFloat(in.readLine());
		}
		catch(Exception e)
		{	System.out.println(e);
		}
		System.out.println("n =" + n);
		System.out.println("f = " + f);
	}
}
