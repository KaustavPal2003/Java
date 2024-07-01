import java.util.*;
class emp
{
	private String ename;
	private int empid;
	private double basic;
	public emp()
	{
		empid=0;
		ename="";
		basic=0;
	}
	public emp(int s1,String s2,double b)
	{
		empid=s1;
		ename=s2;
		basic=b;
	}
public void emp_read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter empid:");
	empid=sc.nextInt();
	System.out.println("Enter name:");
	ename=sc.next();
	System.out.println("Enter basic:");
	basic=sc.nextDouble();
}
public void emp_disp()
{
		System.out.println("empid : "+empid+" name : "+ename+" basic : "+basic);
}
public double get_basic()
{
	return basic;
}
}
class office
{
	private emp[] x;
	public office()
	{
		x=new emp[3];
	}
	public office(int n)
	{
		x=new emp[n];
	}
	public void office_read()
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=new emp();
			x[i].emp_read();
		}
	}
	public void office_disp()
	{
		for(int i=0;i<x.length;i++)
		{
			x[i].emp_disp();
		}
	}
	public void bubble()
{
	emp t=null;
	for(int i=0;i<x.length-1;i++)
		for(int j=0;j<x.length-1-i;j++)
			if(x[j].get_basic()>x[j+1].get_basic())
			{
				t=x[j];
				x[j]=x[j+1];
				x[j+1]=t;
			}
}

public static void main (String[] args) {
	Scanner y=new Scanner(System.in);
	System.out.println("how many employees : ");
	int n=y.nextInt();
	office h=new office(n);
	h.office_read();
	h.bubble();
	h.office_disp();
}
}