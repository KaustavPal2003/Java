import instrument1.abc.cde.piano;
import instrument1.abc.cde.flute;
import instrument1.abc.cde.guiter;
class test {
	public static void main (String[] args) {
	piano x=new piano();
	System.out.print("obj of piano=> ");
	x.play();
	
	flute y=new flute();
	System.out.print("obj of flute=> ");
	y.play();
	
	guiter z=new guiter();
	System.out.print("obj of guiter=> ");
	z.play();
}
}