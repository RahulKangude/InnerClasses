package staticinnerclass.com;

public class StaticOuter {

	static class Nexted {
		public static void main(String[] args) {
			System.out.println("main nexed");
		}

		public void m1() {
			System.out.println("static class method m1");
		}
	}

	public static void main(String[] args) {
		Nexted n = new Nexted();
		n.m1();
	}
}
