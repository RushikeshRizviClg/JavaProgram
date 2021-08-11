// Demonstrate Buttons
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.AppletStub;
/*
<applet code="ButtonDemo2.class" width=480 height=480>
</applet>
*/


public class ButtonDemo2 extends Applet implements ActionListener 
{	
	
	TextField name, pass,num;
	Label l1,l2,i;
	int opt=0;
	TextField t1,t2;
	String msg = "";//wow secondApplet;
	Button yes, no, may,mo,btn,bo,c;
	
	
	
	public void init() 
	{	
		
		Label namep = new Label("Login ID: ", Label.RIGHT);
		Label passp = new Label("Password: ", Label.RIGHT);
		name = new TextField(12);
		pass = new TextField(12);
		pass.setEchoChar('*');
		i=new Label("Welcome to FaceEmoji ");
		l1=new Label("Enter Name :"); // creating a label with text as "enter a number"
		btn=new Button("Login"); // creating button and writing caption on button
		btn.addActionListener(this); // adding button on action event

		l2=new Label ("Click on Login for enter your  feeling  "); // creating a label with text as "its square is "
		t1=new TextField(15); // creating a TextField of size 5
		t2=new TextField(20);
		add(namep);
		add(name);
		add(passp);
		add(pass);
		add(i); // adding label
		add(l1); // adding label
		add(t1); // adding textfield
		add(l2); // adding label
		add(btn);
		t2.setEditable(false);// setting the textfield as uneditable
		add(t2); // adding textfield
		
		
			
		yes = new Button("Wow");
		no = new Button("Happy");
		may = new Button("Sad");
		mo=new Button("Smile");
		bo=new Button("Angery");
		c=new Button("SignOut");
		add(yes);
		add(no);
		add(may);
		add(mo);
		add(bo);
		add(c);
		name.addActionListener(this);
		pass.addActionListener(this);
		yes.addActionListener(this);
		no.addActionListener(this);
		may.addActionListener(this);
		mo.addActionListener(this);
		bo.addActionListener(this);
		c.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	 {
		String str = ae.getActionCommand();
	
		// if clicked on calculate button it will perform following arithmatic operation
	if(ae.getSource()==btn)
	{
		 num =new TextField(10);//taking the value of textfield1 into num
		t2.setText("You Succesfully Enter");//displaying the value of sqr in textfield2
	}
	if(str.equals("Wow")) 
	{
		msg = "You pressed Wow.";
		setBackground(Color.orange);		
		opt=1;
		
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
		setBackground(Color.lightGray);
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
		setBackground(Color.cyan);
		opt=5;
	}
	else  if(str.equals("SignOut"))
	{
		
		setBackground(Color.white);
		setForeground(Color.white);
		msg = "Now you are logout .";
		opt=6;
	}
	repaint();
	
	}
	public void paint(Graphics g) 
	{
		
		

		g.setColor(Color.black);   
		Font i = new Font("Arial", Font.BOLD, 26);
		g.setFont(i);
		g.drawString("Login Id: " + name.getText(), 6, 160);
		g.drawString("Selected text in Login Id is: "+ name.getSelectedText(), 6, 190);
		g.drawString("Password: " + pass.getText(), 6, 220);
		Font f = new Font("Arial", Font.BOLD, 26);
		g.setFont(f);
     		g.setColor(Color.green);      
		g.drawString(msg, 10, 250);
		
		switch(opt)
		{
		case 1:  g.drawString(msg, 10, 250);
		 g.setColor(Color.red); 
		g.drawString(msg, 10, 250);
		 g.setColor(Color.yellow);
		g.fillOval(20,320,150,150);
		g.setColor(Color.white);
		g.fillOval(53,360,15,25);   //left
	
		g.setColor(Color.black);
		g.fillOval(57,371,8,8);

		g.setColor(Color.white);
		g.fillOval(120,360,15,25);  //right

		g.setColor(Color.black);
		g.fillOval(124,371,8,8);

		int x[]={95,85,106,95};
		int y[]={385,404,404,385};

		g.setColor(Color.red);
		g.fillPolygon(x,y,4);

		g.setColor(Color.black);
		g.fillArc(76,415,38,38,0,360); 
 
		g.setColor(Color.red); 
		Font h= new Font("TimesRoman", Font.BOLD, 16);
		g.setFont(h);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 280);
		g.drawString("Thank You for updating Your Feeling.", 10, 310);			

		break;
						
						
	case 2:g.setColor(Color.yellow);
		g.fillOval(20,320,150,150);
		g.setColor(Color.white);
		g.fillOval(53,360,15,25);  
		g.setColor(Color.black);
		g.fillOval(57,371,8,8);   //left
		g.setColor(Color.white);
		g.fillOval(120,360,15,25);  //right

		g.setColor(Color.black);
		g.fillOval(124,371,8,8);

		int u[]={95,105,86,95};
		int v[]={385,404,404,385};

		g.setColor(Color.red);
		g.fillPolygon(u,v,4);

		g.setColor(Color.blue);
		g.fillArc(55,395,78,50,0,-180);  
		

		g.setColor(Color.red); 
		Font k= new Font("TimesRoman", Font.BOLD, 16);
		g.setFont(k);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 280);
		g.drawString("Thank You for updating Your Feeling.", 10, 310);	
						
		break;	
						
	case 3:g.setColor(Color.yellow);
		g.fillOval(20,320,150,150);
		g.setColor(Color.black);
		g.fillOval(53,375,15,6);   //left
		g.setColor(Color.white);
		g.fillOval(120,360,15,25);  //right
 
		g.setColor(Color.black);
		g.fillOval(124,371,8,8);

		int w[]={95,85,106,95};
		int z[]={385,404,404,385};

		g.setColor(Color.red);
		g.fillPolygon(w,z,4);

		g.setColor(Color.black);
		g.drawArc(55,420,78,50,0,180);  
		Font l= new Font("TimesRoman", Font.BOLD, 16);
		g.setFont(l);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 280);
		g.drawString("Thank You for updating Your Feeling.", 10, 310);
		
		break;
						
	case 4:
		g.setColor(Color.yellow);
		g.fillOval(20,320,150,150);
		g.setColor(Color.black);
		g.fillOval(50,360,15,25);
		g.fillOval(120,360,15,25);
		int a[]={95,85,106,95};
		int b[]={385,404,404,385};
		g.drawPolygon(a,b,4);
		g.drawArc(55,395,78,50,0,-180);
		
		g.setColor(Color.red); 
		Font m= new Font("TimesRoman", Font.BOLD, 16);
		g.setFont(m);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 280);
		g.drawString("Thank You for updating Your Feeling.", 10, 310);			
		

		break;
						
						
	case 5:  
	                   //set red color
          		g.setColor(Color.red); //face
		g.fillOval(20, 320, 150, 150);
	                   //set black color
	                   g.setColor(Color.black);
	                  //eyes
	                  g.fillOval(50, 360, 15, 25);
	                  g.fillOval(120, 360, 15, 25);
	                  
	                   //set yellow color
	                  g.setColor(Color.blue);
                                     //mouth
	                  g.fillArc(55,395,78,50, 0, -180);
			  
		g.setColor(Color.red); 
		Font n= new Font("TimesRoman", Font.BOLD, 16);
		g.setFont(n);  
		g.drawString("Ankit Virparia, www.ankit.co", 10, 280);
		g.drawString("Thank You for updating Your Feeling .", 10, 310);

		break;			

						
		}
		
	}

}


	