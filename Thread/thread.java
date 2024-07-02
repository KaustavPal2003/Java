import java.io.*;
import java.util.*;
class newthread implements Runnable
{
	String name;
	Thread t;
	newthread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new Thread "+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+" :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name+"interrupted:");
		}
		System.out.println(name+" existing");
	}
}
class text
{
	public static void main (String[] args) {
		newthread obj1=new newthread("one");
		newthread obj2=new newthread("two");
		newthread obj3=new newthread("three");
		System.out.println("thread one is alive:"+obj1.t.isAlive());
		System.out.println("thread two is alive:"+obj2.t.isAlive());
		System.out.println("thread three is alive:"+obj3.t.isAlive());	
			try
			{
				System.out.println("waiting for threads to finish:");
				obj1.t.join();
				obj2.t.join();
				obj3.t.join();
			}
		catch(InterruptedException e)
		{
			System.out.println("main thread interrupted:");
		}
		System.out.println("thread one is alive:"+obj1.t.isAlive());
		System.out.println("thread two is alive:"+obj2.t.isAlive());
		System.out.println("thread three is alive:"+obj3.t.isAlive());	
		System.out.println("main thread existing");
}
}