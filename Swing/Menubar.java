import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComboPanel extends JFrame implements ItemListener
{
	JComboBox ch1=new JComboBox();
	JTextField text=new JTextField(8);
	ComboPanel()
	{
		ch1.addItem("kolkata");
		ch1.addItem("mumbai");
		ch1.addItem("delhi");
		ch1.addItem("chennai");
		setLayout(new FlowLayout());
		add(ch1);
		ch1.addItemListener(this);
		add(text);
		setSize(600,400);
			setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		text.setText((String)e.getItem());
	}
}
class Menubar extends JFrame implements ActionListener{
	JMenu m1=new JMenu("record");
	JMenuBar br=new JMenuBar();
	JMenuItem t1,t2;
	Menubar(){
	t1=new JMenuItem("new");
	t2=new JMenuItem("exit");
	m1.add(t1);
	m1.add(t2);
	br.add(m1);
	setJMenuBar(br);
	t1.addActionListener(this);
	t2.addActionListener(this);
	setVisible(true);
	setSize(600,400);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==t1)
		{
			new ComboPanel();
		}
		else if(e.getSource()==t2)
		{
			System.exit(0);
		}
	}
	public static void main (String[] args) {
		new Menubar();
			
}
}