/* Application of constructors
*constructor has same name of class itself
*/
class Rectangle_area
{	
	int l,w;
	Rectangle_area(int x , int y)          //defining constructor
	{
		l=x;
		w=y;
	}
	int rectArea()
	{
		return(l*w);
	}
}
class Rectangle
{
	public static void main (String args[])
	{
		Rectangle_area r =new Rectangle_area(15,10);   // calling constructor
		int area = r.rectArea();
		System.out.println("Area of Reactangle is : "+ area);
	}
}