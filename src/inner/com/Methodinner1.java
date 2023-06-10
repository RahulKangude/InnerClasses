package inner.com;

public class Methodinner1 {
	public static void main(String[] args) {
		Methodinner1 M = new Methodinner1();
		Test t=new Test();t.m1();
	}
}

class Test {

	int i = 10;
	static int a = 54;
	public void m1() {
		System.out.println("child");
		int k = 7;
		final int l = 8;
		class Inner1 {
			public void m2() {
				System.out.println(a);
				System.out.println("main");
		}
	}
		Inner1 i = new Inner1();
		i.m2();
	}
}