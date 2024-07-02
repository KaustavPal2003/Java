package db;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class swing extends JFrame implements ActionListener {
    private JLabel l1,l2,l3;
    private JTextField t1,t2,t3;
    private JButton b1,b2,b3,b4,b5,b6;
    private JPanel[] p;
    private JComboBox cb;
    public swing() {
    	super("calc");
    	
    	l1=new JLabel("id : ");
    	l2=new JLabel("Name : ");
    	l3=new JLabel("phone : ");
    	
    	t1=new JTextField(20);
    	t2=new JTextField(20);
    	t3=new JTextField(20);
    	
    	b1=new JButton("INS");
    	b2=new JButton("DELETE");
    	b3=new JButton("UPDATE");
    	b4=new JButton("FIND");
    	b5=new JButton("RESET");
    	b6=new JButton("CANCEL");
    	
        p=new JPanel[5];
        for(int i=0;i<p.length;i++)
        {
        	p[i]=new JPanel();
        }
        p[0].setLayout(new GridLayout(1,2,20,20));
        p[0].add(l1);
        p[0].add(t1);
        
        p[1].setLayout(new GridLayout(1,2,20,20));
        p[1].add(l2);
        p[1].add(t2);
        
        p[2].setLayout(new GridLayout(1,2,20,20));
        p[2].add(l3);
        p[2].add(t3);
        
        p[3].setLayout(new GridLayout(1,3,20,20));
        p[3].add(b1);
        p[3].add(b2);
        p[3].add(b3);
        
        p[4].setLayout(new GridLayout(1,3,20,20));
        p[4].add(b4);
        p[4].add(b5);
        p[4].add(b6);
        
        Container c=getContentPane();
        c.setLayout(new GridLayout(5,3,10,10));
		for(int i=0;i<p.length;i++)
			c.add(p[i]);
			
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
                
        setBackground(Color.cyan);
        setResizable(false);
        setSize(400,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    	dml d=new dml();
    	if(e.getSource()==b1)
    	{
    		
    		System.out.println (d.ins(t1.getText(),t2.getText(),t3.getText()));
    	}
    	else if(e.getSource()==b2)
    	{
    		System.out.println (d.del(t1.getText()));
    	}
    	else if(e.getSource()==b3)
    	{
    		System.out.println (d.up(t1.getText(),t2.getText(),t3.getText()));
    	}
    	else if(e.getSource()==b4)
    	{
    		ArrayList<String> arr=d.find(t1.getText());
    		System.out.println (d.find(t1.getText()));
    		t2.setText(arr.get(1));
    		t3.setText(arr.get(2));
    	}
    	/*else if(e.getSource()==b5)
    	{
    		System.out.println (d.list());
    	}*/
    	else if(e.getSource()==b5)
    	{
    		t1.setText("");
    		t2.setText("");
    		t3.setText("");
    	}
    	else if(e.getSource()==b6)
    	{
    		System.exit(0);
    	}
    }
    public static void main (String[] args) 
    {
    	swing r=new swing();
    }
}