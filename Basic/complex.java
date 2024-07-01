import java.util.*;

class complex
{
	private static int count=0;
    private int real,img;
    public complex()
    {
        real=0;
        img=0;
        count++;
        System.out.println("obj=>"+count);
    }
    public complex(int a,int b)
    {
        real=a;
        img=b;
        count++;
        System.out.println("obj=>"+count);
    }
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("real part");
        real=sc.nextInt();
        System.out.println("img part");
        img=sc.nextInt();
    }
    public static complex add(complex a,complex b)
    {
        complex c=new complex();
        c.real=a.real+b.real;
        c.img=a.img+b.img;
        return c;
    }
    public static complex mul(complex a,complex b)
    {
        complex c=new complex();
        c.real=a.real*b.real-a.img*b.img;
        c.img=a.real*b.img+b.real*a.img;
        return c;
    }
    public void disp()
    {
        System.out.println("real=>"+real+"img=>"+img);
    }
}

/*class div extends complex
{
	public static div div1(div a,div b)
    {
    	
    }
}*/

class Main
{
    public static void main(String[] args)
    {
        complex c=new complex();
        c.read();
        complex d=new complex();
        d.read();
        complex e=complex.add(c,d);
        /*div c1=new div();
        c1.read();
        div d1=new div();
        d1.read();
        complex f=complex.mul(c,d);
        div i=div.div1(c1,d1);*/
        c.disp();
        d.disp();
        e.disp();
    }
}
