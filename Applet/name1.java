import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class name1 extends Applet implements ActionListener {
    private Label l1;
    private TextField t1;
    private Button b1,b2;
    private int a,x;
    private String s1;
    private Panel p;
    public void init() {
    	a=40;
        x=0;
        s1="";
        l1=new Label("Enter name : ");
        t1=new TextField(20);
        b1=new Button("SUBMIT");
        b2=new Button("RESET");
        p=new Panel();
        p.setLayout(new GridLayout(2,2,20,20));
        
        p.add(l1);
        p.add(t1);
        
        p.add(b1);
        p.add(b2);
        add(p);
        
        p.setBackground(Color.yellow);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g) {
        g.setFont(new Font("calibri",1,25));
        g.setColor(Color.red);
    	g.drawString(s1,x,250);
    	x=x+a;
    	if(x>500)
        	a=-40;
        if(x<=0)
        	a=40;
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
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		s1=t1.getText();
    	}
    	else if(e.getSource()==b2)
    	{
    		s1="";
    		t1.setText("");
    		repaint();
    	}
    }
}