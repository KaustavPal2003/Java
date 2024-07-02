import hello.abc.cde.square;
import hello.abc.cde.rectangle;
public class test {
	public static void main (String[] args) {
		rectangle y=new rectangle(4,6);
		y.calcArea();
		y.calcPeri();
		y.display();
		
		square u=new square(3);
		u.calcArea();
		u.calcPeri();
		u.display();
}
}