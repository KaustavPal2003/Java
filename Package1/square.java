package hello.abc.cde;
public class square implements polygon{
	private double area,perimeter,side;
    public square() {
    	side=4;
    }
    public square(double s) {
    	side=s;
    }
	public void calcArea()
	{
		area=side*side;
	}
	public void calcPeri()
	{
		perimeter=4*side;
	}
	public void display()
	{
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
	}
}