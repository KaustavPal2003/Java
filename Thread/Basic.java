class A extends Thread
{
	private String pname;
	public A(String name)
	{
		pname=name;
		System.out.println("Process "+pname+" started ");
	}
	synchronized public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(pname+"=>"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
		System.out.println(pname+" process stopped");
	}
}
class B implements Runnable
{
	private String pname;
	Thread t;
	public B(String name)
	{
		pname=name;
		t=new Thread(this,pname);
		System.out.println("Process "+pname+" started");
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
	}
	synchronized public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(pname+"=>"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			if(i==10)
			{
				System.out.println(pname+" process stopped");
				t.stop();
			}
		}
	}
	
}
class text
{
	public static void main (String[] args) {
		A s1=new A("1st");
		s1.setPriority(Thread.MAX_PRIORITY);
		s1.start();
		
		B s2=new B("2nd");
}
}
