import java.io.*;
class queue
{
	private int[] x;
	private int front;
	private int rear;
	public queue()
	{
		front=-1;
		rear=-1;
		x=new int[5];
	}
	public queue(int n)
	{
		front=-1;
		rear=-1;
		x=new int[n];
	}
public void push(int a)
{
	try
	{
		if(front==-1)
			front=0;
		rear++;
		x[rear]=a;
		return ;
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		rear--;
		System.out.println("queue is full");
	}
}
public int pop()
{
	int q=0;
	try
	{
		q=x[front];
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		front++;
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("queue is empty");
	}
	return(q);
}
public void display()
{
	try
	{
		System.out.println("List :");
		if(front!=-1)
		{
				System.out.println(front+","+rear);
				for(int i=front;i<=rear;i++)
					System.out.println(x[i]);
		}
		return ;
	}
	catch(ArrayIndexOutOfBoundsException e4)
	{
	}
}

	public static void main (String[] args) throws IOException
	{
	BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the string size:");
	int m=Integer.parseInt(ds.readLine());
	queue s=new queue(m);
	int ch=0;
	do
	{
		System.out.println(" 1.To PUSH");
		System.out.println(" 2.To POP");
		System.out.println(" 3.To EXIT");
		System.out.println("------------------------");
		System.out.println("Enter your choice(1/2/3):");
		ch=Integer.parseInt(ds.readLine());
		System.out.println("-----------------------");
		switch(ch)
		{
			case 1:
					System.out.println("Enter data : ");
					int d=Integer.parseInt(ds.readLine());
					s.push(d);
					s.display();
					break;
			case 2:
					d=s.pop();
					System.out.println("Popped element="+d);
					s.display();
					break;
		}
	}while(ch!=3);
	}
}