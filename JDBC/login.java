import db.dml;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener {
    private JLabel l1,l2;
    private JTextField t1;
    private JPasswordField p1;
    private JButton b1,b2,b3;
    private JPanel[] p;
    private JComboBox cb;
    public login(){
    	super("calc");
    	
    	l1=new JLabel("log_in : ");
    	l2=new JLabel("password : ");
    	
    	t1=new JTextField(20);
    	p1=new JPasswordField(20);
    	
    	b1=new JButton("SUBMIT");
    	b2=new JButton("RESET");
    	b3=new JButton("CANCEL");
    	
    	p=new JPanel[3];
        for(int i=0;i<p.length;i++)
        {
        	p[i]=new JPanel();
        }
        p[0].setLayout(new GridLayout(1,2,20,20));
        p[0].add(l1);
        p[0].add(t1);
        
        p[1].setLayout(new GridLayout(1,2,20,20));
        p[1].add(l2);
        p[1].add(p1);
        
        p[2].setLayout(new GridLayout(1,3,20,20));
        p[2].add(b1);
        p[2].add(b2);
        p[2].add(b3);
        
        Container c=getContentPane();
        c.setLayout(new GridLayout(3,3,10,10));
		for(int i=0;i<p.length;i++)
			c.add(p[i]);
			
		b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setBackground(Color.cyan);
        setResizable(false);
        setSize(350,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		dml d=new dml();
    		boolean f=d.fx_login(t1.getText(),p1.getText());
    		if(f==true)
    			JOptionPane.showMessageDialog(null,"ok");
    		else
    			JOptionPane.showMessageDialog(null,"not match");
    	}
    	else if(e.getSource()==b2)
    	{
    		t1.setText("");
    		p1.setText("");
    	}
    	else if(e.getSource()==b3)
    	{
    		System.exit(0);
    	}
    }
    public static void main (String[] args) 
    {
    	login r1=new login();
    }
}