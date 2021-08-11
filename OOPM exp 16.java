//EXPERIMENT NO.16
//Aim: Write a Program to find Square of a given number using applet.

import java.awt.*; // to load awt
import java.awt.event.*; // to load an event interface
import java.applet.*; // to load an applet class
/* <applet CODE="Square.class" WIDTH=200 HEIGHT=200>
</applet>
*/
//inherit the behaviour of applet and ActionListener
public class Square extends Applet implements ActionListener
{
Label l1,l2; // declaring label as l1,l2
TextField tf1,tf2; // declaring TextField as tf1,tf2
Button btnresult; // declaring Button as btnresult
public void init() // initialising an applet
{
l1=new Label("enter a number"); // creating a label with text as "enter a number"
l2=new Label ("its square is "); // creating a label with text as "its square is "
tf1=new TextField(5); // creating a TextField of size 5
tf2=new TextField(5);
btnresult=new Button("calculate"); // creating button and writing caption on button
btnresult.addActionListener(this); // adding button on action event
add(l1); // adding label
add(tf1); // adding textfield
add(l2); // adding label
tf2.setEditable(false);// setting the textfield as uneditable
add(tf2); // adding textfield
add(btnresult); //adding button
}
public void actionPerformed(ActionEvent ae) // on action event
{
// if clicked on calculate button it will perform following arithmatic operation
if(ae.getSource()==btnresult)
{
int num =Integer.parseInt(tf1.getText());//taking the value of textfield1 into num
int sqr=num*num;// calculating square
tf2.setText(String.valueOf(sqr));//displaying the value of sqr in textfield2
}
}
}
