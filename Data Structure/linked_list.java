import java.io.*;
class node
{
	String name;
	node next;
}
class linklist
{
	private node start;
	public linklist()
	{	
		start=null;
	}
	public void insert() throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		node cur=new node();
		System.out.println("Enter name : ");
		cur.name=d.readLine();
		cur.next=null;
		if(start==null)
		{
			start=cur;
			return ;
		}
		node c=start;
		while(c.next!=null)
		{
			c=c.next;
		}
		c.next=cur;
	}
	public void list()
	{
		node c=null;
		System.out.println("\n"+"List : ");
		for(c=start;c!=null;c=c.next)
		{
			System.out.println(c.name);
		}
	}
	public static void main (String[] args) throws IOException{
		linklist ls=new linklist();
		int t=0;
		DataInputStream y=new DataInputStream(System.in);
		do
		{
			System.out.println("1. ins"+"\n"+"2. list"+"\n"+"3.	exit");
			System.out.println("enter choice");
			t=Integer.parseInt(y.readLine());
			switch(t)
			{
				case 1:
					ls.insert();
					ls.list();
					break;
				case 2:
					ls.list();
					break;
			}
		}while(t!=3);
}
}