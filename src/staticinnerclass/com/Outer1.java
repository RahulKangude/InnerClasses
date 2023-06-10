package staticinnerclass.com;

public class Outer1 {
	interface Vechical {
		void company();
	}

	class Bus implements Vechical{
		@Override
		public void company() {
			System.out.println(" Bus Company ");

		}

		class Car implements Vechical{
			@Override
			public void company() {
				System.out.println(" car Company ");

			}

		}


	}
	public static void main(String[] args) {
		Outer1 o=new Outer1();
		Bus b=o.new Bus();
	   Bus. Car c=b.new Car();
		b.company();
		c.company();
		
	}
}