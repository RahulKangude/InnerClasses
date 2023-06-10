package staticinnerclass.com;

public class Interface1 {//interface inside interface
	public static void main(String[] args) {
		Testt t=new Testt();
		t.m1();
		Testt1 t2=new Testt1();
		t2.m2();
	}
}

interface Outero{
	public void m1();
	public  static final int  i=10;
	interface Inner{
		public void m2();
	}
}
class Testt implements Outero{

	@Override
	public void m1() {
		System.out.println("Outer interface method implementation");

	}
}
class Testt1 implements Outero.Inner{
	@Override
	public void m2() {
		System.out.println("m2 () Inner interface ");
	}
}