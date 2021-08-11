// Demonstrate Buttons
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.AppletStub;
/*
<applet code="ButtonDemo.class" width=350 height=450>
</applet>
*/


public class ButtonDemo extends Applet implements ActionListener 
{	
	
	
		
	  
	  
	
	TextField name, pass;
	Label l1,l2,i;
	int opt=0,n;
	TextField t1,t2;
	String msg = "";//wow secondApplet;
	Button yes, no, may,mo,btn,bo;
	
	
	
	public void init() 
	{	
		
		Label namep = new Label("Login ID: ", Label.RIGHT);
		Label passp = new Label("Password: ", Label.RIGHT);
		name = new TextField(12);
		pass = new TextField(8);
		pass.setEchoChar('*');
		i=new Label("Welcome to Face Emoji");
		l1=new Label("Enter Name :"); // creating a label with text as "enter a number"
		l2=new Label (" U are enter in feeling account "); // creating a label with text as "its square is "
		t1=new TextField(15); // creating a TextField of size 5
		t2=new TextField(15);
		btn=new Button("Login"); // creating button and writing caption on button
		btn.addActionListener(this); // adding button on action event
		add(namep);
		add(name);
		add(passp);
		add(pass);
		add(i); // adding label
		add(l1); // adding label
		add(t1); // adding textfield
		add(l2); // adding label
		t2.setEditable(false);// setting the textfield as uneditable
		add(t2); // adding textfield
		add(btn);
		
			
		yes = new Button("Wow");
		no = new Button("Happy");
		may = new Button("Sad");
		mo=new Button("Smile");
		bo=new Button("Angery");
		add(yes);
		add(no);
		add(may);
		add(mo);
		add(bo);
		name.addActionListener(this);
		pass.addActionListener(this);
		yes.addActionListener(this);
		no.addActionListener(this);
		may.addActionListener(this);
		mo.addActionListener(this);
		bo.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	Date date = new Date();

     // display time and date using toString()
      System.out.println(date.toString());	
		
		
	String str = ae.getActionCommand();
		// if clicked on calculate button it will perform following arithmatic operation
if(ae.getSource()==btn)
{
int num =Integer.parseInt(t1.getText());//taking the value of textfield1 into num// calculating square
n=num;
t2.setText(String.valueOf(num));//displaying the value of sqr in textfield2
}

	if(str.equals("Wow")) 
	{
		msg = "You pressed Wow.";
		setBackground(Color.orange);		
		opt=1;
		repaint();
	}

	else if(str.equals("Login")) 
	{	
		msg = "You pressed  Login.";
		setBackground(Color.lightGray);
	}
	else if(str.equals("Happy")) 
	{	
		msg = "You pressed  Happy.";
		setBackground(Color.magenta);
		opt=2;
	}
	else  if(str.equals("Sad"))	
	{
		msg = "You pressed Sad.";
		setBackground(Color.yellow);
		opt=3;
	}
	else  if(str.equals("Smile"))
	{
		msg = "You pressed Smile.";
		setBackground(Color.pink);
		opt=4;
	}
	else  if(str.equals("Angery"))
	{
		msg = "You pressed Angery.";
		setBackground(Color.darkGray);
		opt=5;
	}
	repaint();
	
	
	
	}
	public void paint(Graphics g) 
	{
		do
		
		{Font j= new Font("TimesRoman", Font.BOLD, 26);
		g.setFont(j);  
		g.drawString("Ankit Virparia, www.ankit.co", 100, 25);
		
		Font q= new Font("Arial", Font.BOLD, 26);
		g.setFont(q);
		g.drawString("Name: " + name.getText(), 6, 60);
		g.drawString("Selected text in name: "+ name.getSelectedText(), 6, 90);
		g.drawString("Password: " + pass.getText(), 6, 120);
		Font f = new Font("Arial", Font.BOLD, 26);
		g.setFont(f);
        g.setColor(Color.GREEN);      
		g.drawString(msg, 10, 150);
		
		switch(opt)
		{
				case 1:  g.drawString(msg, 10, 150);
		 g.setColor(Color.red); 
		g.drawString(msg, 10, 150);
		 g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);
		g.setColor(Color.white);
		g.fillOval(53,60,15,25);   //left
	
		g.setColor(Color.black);
		g.fillOval(57,71,8,8);

		g.setColor(Color.white);
		g.fillOval(120,60,15,25);  //right

		g.setColor(Color.black);
		g.fillOval(124,71,8,8);

		int x[]={95,85,106,95};
		int y[]={85,104,104,85};

		g.setColor(Color.red);
		g.fillPolygon(x,y,4);

		g.setColor(Color.black);
		g.fillArc(76,115,38,38,0,360); 
 
		g.setColor(Color.red); 
		Font h= new Font("TimesRoman", Font.BOLD, 26);
		g.setFont(h);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 180);
		g.drawString("Thank You for updating Your Felling", 10, 210);			

						break;
						
						
						case 2:g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);
		g.setColor(Color.black);
		g.fillOval(53,75,15,6);   //left
		g.setColor(Color.white);
		g.fillOval(120,60,15,25);  //right

		g.setColor(Color.black);
		g.fillOval(124,71,8,8);

		int u[]={95,115,106,95};
		int v[]={85,104,104,85};

		g.setColor(Color.red);
		g.fillPolygon(u,v,4);

		g.setColor(Color.blue);
		g.fillArc(55,95,78,50,0,-180);  
		g.drawLine(55,120,132,120);

		g.setColor(Color.red); 
		Font k= new Font("TimesRoman", Font.BOLD, 26);
		g.setFont(k);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 180);
		g.drawString("Thank You for updating Your Felling", 10, 210);	
						
						break;	
						
						case 3:g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);
		g.setColor(Color.black);
		g.fillOval(53,75,15,6);   //left
		g.setColor(Color.white);
		g.fillOval(120,60,15,25);  //right
 
		g.setColor(Color.black);
		g.fillOval(124,71,8,8);

		int w[]={95,85,106,95};
		int z[]={85,104,104,85};

		g.setColor(Color.red);
		g.fillPolygon(w,z,4);

		g.setColor(Color.black);
		g.drawArc(55,120,78,50,0,180);  
		Font l= new Font("TimesRoman", Font.BOLD, 26);
		g.setFont(l);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 180);
		g.drawString("Thank You for updating Your Felling", 10, 210);
		
						break;
						
						case 4:
							g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);
		g.setColor(Color.black);
		g.fillOval(50,60,15,25);
		g.fillOval(120,60,15,25);
		int a[]={95,85,106,95};
		int b[]={85,104,104,85};
		g.drawPolygon(a,b,4);
		g.drawArc(55,95,78,50,0,-180);
		g.drawLine(50,126,60,116);

		g.drawLine(128,115,139,126);
		
		g.setColor(Color.red); 
		Font m= new Font("TimesRoman", Font.BOLD, 26);
		g.setFont(m);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 180);
		g.drawString("Thank You for updating Your Felling", 10, 210);			
						break;
						
						
						case 5:  g.setColor(Color.green);
//display a rectangle to contain drawing
              g.fillRect(40,40,200,200);
              //set red color
              g.setColor(Color.red);
              //face
              g.fillOval(90, 70, 80, 80);
              //set black color
              g.setColor(Color.black);
              //eyes
              g.fillOval(110, 95, 5, 5);
              g.fillOval(145, 95, 5, 5);
              //nose
              g.drawLine(130, 95, 130, 115);
              //set yellow color
              g.setColor(Color.yellow);
              //mouth
              g.fillArc(113, 115, 35, 20, 0, -180);
			  
			  g.setColor(Color.red); 
			Font n= new Font("TimesRoman", Font.BOLD, 26);
			g.setFont(n);  
			g.drawString("Ankit Virparia, www.ankit.co", 10, 180);
			g.drawString("Thank You for updating Your Felling", 10, 210);			

						
		}
	
	
		}while(n!=9);
	
	
	
	
	
	
	
		}
	
        
        
}



	