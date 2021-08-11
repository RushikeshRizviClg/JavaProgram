import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.*;
/*
<applet code="OriginalApplet.class" width=250 height=250>
</applet>
*/
public class OriginalApplet extends Applet implements Runnable, AppletStub {
  String appletToLoad;
  Thread appletThread;

  public void init() {
    appletToLoad = getParameter("appletToLoad");
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.drawString("Loading second applet ...", 30, 30);
  }

  public void run() {
    try {
      Class appletClass = Class.forName(appletToLoad);
      Applet realApplet = (Applet) appletClass.newInstance();
      realApplet.setStub(this);
      setLayout(new GridLayout(1, 0));
      add(realApplet);
      realApplet.init();
      realApplet.start();
    } catch (Exception e) {
      System.out.println(e);
    }
    validate();
  }

  public void start() {
    appletThread = new Thread(this);
    appletThread.start();
  }

  public void ThrowsNullPointerExceptionstop() {
    appletThread.stop();
    appletThread = null;
  }

  public void appletResize(int width, int height) {
    resize(width, height);
  }
}
