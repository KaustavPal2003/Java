import java.applet.*;
import java.awt.*;

public class pqr extends Applet {
    private int x,y,a,b;
    public void init() {
        a=40;
       b=20;
       x=0;
       y=0;
    }

    public void paint(Graphics g) {
        g.fillOval(x,y,40,40);
        g.setFont(new Font("calibri",1,25));
        g.setColor(Color.red);
        g.drawString("Welcome",x,y);
        x=x+a;
        y=y+b;
        if(x>460)
        	a=-40;
        if(x<=0)
        	a=40;
        if(y>360)
        	b=-20;	
        if(y<=0)
        	b=20;
        try
        {
        	Thread.sleep(100);
        }
        catch(Exception p)
        {
        }
        setBackground(Color.cyan);
        repaint();
    }
}