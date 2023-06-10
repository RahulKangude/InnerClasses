package inner.com;

public class Normalinner {
	public static void main(String[] args) {
		Normalinner n = new Normalinner();
//		Normalinner.Inner I=n.new Inner();
//		I.m1();	
//		n.m2();
		// new Normalinner().new Inner().m1();
	}

	{
		Inner i = new Inner();
		i.m1();
	}
	int x = 10;
	String s = "Rahul";

	class Inner {
		int x = 52;

		public void m1() {
			int x = 45;
			System.out.println(" inner method x=" + x);
			System.out.println(" inner class x=" + this.x);
			System.out.println(" outer class x=" + Normalinner.this.x);

		}
	}

}
