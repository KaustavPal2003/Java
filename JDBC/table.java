import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import db.dml;
public class showall extends JFrame
{
	private JTable tb1;
	public showall()
	{
		super("List");
		dml u=new dml();
		ArrayList v=u.list();
		String[] head={"name","roll","mob"};
		int row=v.size()/3;
		String[][] y=new String[row][3];
		int z=0;
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<3; j++) {
				y[i][j]=(String)v.get(z);
				z++;
}
}
tb1=new JTable(y,head);
JScrollPane jp=new JScrollPane(tb1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(jp);
setSize(300,400);
setVisible(true);
	}
	public static void main (String[] args) {
		showall b=new showall();
}
}
