import java.util.*;
class student
{
	private String id,name,g;
	private int Math_marks,English_marks,Computer_marks,total_marks;
	public student()
	{
		id="";
		name="";
		Math_marks=0;
		English_marks=0;
		Computer_marks=0;
	}
	public student(String s1,String s2,int b,int c,int d)
	{
		id=s1;
		name=s2;
		Math_marks=b;
		English_marks=c;
		Computer_marks=d;
	}
public void Read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id:");
	id=sc.next();
	System.out.println("Enter name:");
	name=sc.next();
	System.out.println("Enter Math_marks:");
	Math_marks=sc.nextInt();
	System.out.println("Enter English_marks:");
	English_marks=sc.nextInt();
	System.out.println("Enter Computer_marks:");
	Computer_marks=sc.nextInt();
	
}
public String grade(int m)
{
	if(m>=80)
		g="A";
		else if(m>=60 && m<80)
			g="B";
			else if(m>=40 && m<60)
				g="C";
				else
					g="D";
	return g;
}
public void disp()
{
	total_marks=Math_marks+English_marks+Computer_marks;
		System.out.println("id:"+id+"name:"+name);
		System.out.println("Math_marks:"+Math_marks+"("+grade(Math_marks)+")");
		System.out.println("English_marks:"+English_marks+"("+grade(English_marks)+")");
		System.out.println("Computer_marks:"+Computer_marks+"("+grade(Computer_marks)+")");
		System.out.println("total_marks:"+total_marks);
}
public static void main (String[] args) {
	student s1=new student();
	s1.Read();
	s1.disp();
	student s2=new student("1001","mr. x",50,60,70);
	s2.disp();
}
}