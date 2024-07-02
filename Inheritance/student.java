import java.util.*;
class student
{
	private String name;
	private int roll;
	public student()
	{
		roll=0;
		name="";
	}
	public student(int b,String s1)
	{
		roll=b;
		name=s1;
	}
public void student_read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter roll:");
	roll=sc.nextInt();
	System.out.println("Enter name:");
	name=sc.next();
}
public void student_disp()
{
		System.out.println("roll:"+roll+"\nname:"+name);
}
}
class subject extends student
{
	protected int sub1,sub2,sub3;
	public subject()
	{
		super();
		sub1=0;
		sub2=0;
		sub3=0;
	}
	public subject(int r,String nm,int m,int n,int o)
	{
		super(r,nm);
		sub1=m;
		sub2=n;
		sub3=o;
	}
	public void subject_read()
	{
			Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks on sub1:");
	sub1=sc.nextInt();
	System.out.println("Enter marks on sub2:");
	sub2=sc.nextInt();
	System.out.println("Enter marks on sub3:");
	sub3=sc.nextInt();
	}
	public void subject_disp()
	{
		System.out.println("sub1 : "+sub1);
		System.out.println("sub2 :"+sub2);
		System.out.println("sub3 :"+sub3);
	}
}
final class result extends subject
{
	private float total,per;
	public result()
	{
	}
	public result(int m1,String m2,int m3,int m4,int m5)
	{
		super(m1,m2,m3,m4,m5);
	}
	public void msheet()
	{
		total=sub1+sub2+sub3;
		per=total/3;
		System.out.println("Total : "+total+"per : "+per);
	}
public static void main (String[] args) {
	result w=new result(1,"ram",40,50,60);
	w.student_disp();
	w.subject_disp();
	w.msheet();
	
	result w1=new result();
	w1.student_read();
	w1.subject_read();
	w1.student_disp();
	w1.subject_disp();
	w1.msheet();
}
}
