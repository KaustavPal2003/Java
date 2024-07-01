import java.util.*;
class fraction
{
	private static int count=0;
	private int num,den;
	public fraction()
	{
		num=1;
		den=1;
		count++;
		System.out.println("count=>"+count);
	}
	public fraction(int p,int q)
	{
		num=p;
		den=q;
		count++;
		System.out.println("count=>"+count);
	}
public void Read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("num");
	num=sc.nextInt();
	System.out.println("din");
	den=sc.nextInt();
}
public void disp()
{
		System.out.println(num+"/"+den);
}

public static int lcm(int a,int b)
{
	int r,i=2,t;
	if(a<b)
	{
		t=b;
		b=a;
		a=t;
	}
	r=a;
	while(r%b!=0)
	{
		r=a*i;
		i++;
	}
	return r;
}

public static fraction add(fraction f1,fraction f2)
{
	fraction f3=new fraction();
	int u=lcm(f1.den,f2.den);
	f3.den=u;
	f3.num=(u/f1.den)*f1.num+(u/f2.den)*f2.num;
	return f3;
}

	public static void main (String[] args) {
	fraction a=new fraction();
	fraction b=new fraction();
	a.Read();
	b.Read();
	a.disp();
	b.disp();
	fraction t=fraction.add(a,b);
	t.disp();
}
}
