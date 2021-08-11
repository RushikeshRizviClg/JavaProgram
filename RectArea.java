class Rectangle
{	
	int l,w;                                                                                   //Declaration of variables
	void getData(int x,int y)                                                  //Defination of methods
	{
		l=x;	
		w=y;
	}
	int rectArea ()                                                                   //Defination of another method
	{
		int area=l*w;
		return(area);
	}
}
class RectArea                                                                                         //Class with main method
{
	public static void main(String args[])
	{
		int a1,a2;
		Rectangle r1 =new Rectangle();                      //Creating objects
		Rectangle r2 =new Rectangle();
		r1.l=15;                                                                      //Accesing variables
		r1.w=10;
		a1=r1.l * r1.w;
		r2.getData(20,12);                                                  //Accessing methods
		a2=r2.rectArea();
		System.out.println("a1 ="+ a1);
		System.out.println("a2 ="+ a2);
	}
}