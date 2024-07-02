import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class radiopanel extends JPanel implements ActionListener{
	JRadioButton ch1=new JRadioButton("Kolkata");
	JRadioButton ch2=new JRadioButton("Delhi");
	JRadioButton ch3=new JRadioButton("Mumbai");
	JTextField text=new JTextField(8);
	ButtonGroup bg=new ButtonGroup();
	radiopanel()
	{
		setLayout(new FlowLayout());
		add(ch1);
		add(ch2);
		add(ch3);
		bg.add(ch1);
		bg.add(ch2);
		bg.add(ch3);
		ch1.addActionListener(this);
		ch2.addActionListener(this);
		ch3.addActionListener(this);
		add(text);
	}
	public void actionPerformed(ActionEvent a)
	{
		text.setText(a.getActionCommand());
	}
}
class Combopanel extends JPanel implements ItemListener
{
	JComboBox ch1=new JComboBox();
	JTextField text=new JTextField(8);
	Combopanel()
	{
		ch1.addItem("kolkata");
		ch1.addItem("mumbai");
		ch1.addItem("delhi");
		ch1.addItem("chennai");
		setLayout(new FlowLayout());
		add(ch1);
		ch1.addItemListener(this);
		add(text);
	}
	public void itemStateChanged(ItemEvent e)
	{
		text.setText((String)e.getItem());
	}
}
class TabFrame extends JFrame
{
	JTabbedPane tp=new JTabbedPane();
	TabFrame()
	{
		tp.addTab("Combo box",new Combopanel());
		tp.addTab("radio Button",new radiopanel());
		add(tp);
		setVisible(true);
		setSize(600,400);
	}
	public static void main (String[] args) {
		new TabFrame();
}
}