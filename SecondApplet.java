import java.awt.*;
/*
<applet code="SecondApplet.class" width=250 height=250>
</applet>
*/
public class SecondApplet extends java.applet.Applet {
TextField textField;
public void init() {
System.out.println("Starting Second applet");
add(new Label("Second Applet"));
add(textField = new TextField( 10 ) );
String s = getParameter("SecondAppletParm");
textField.setText(s);
}
}