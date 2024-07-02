package hello.abc.cde;
public class rectangle implements polygon
{
	private double area,perimeter,len,bre;
	public rectangle()
	{
		len=4;
		bre=6;
	}
	public rectangle(double s1,double s2)
	{
		len=s1;
		bre=s2;
	}
	public void calcArea()
	{
		area=len*bre;
	}
	public void calcPeri()
	{
		perimeter=2*(len+bre);
	}
	public void display()
	{
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
	}
}