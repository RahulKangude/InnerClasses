package staticinnerclass.com;

public class Vivo {
	public static void main(String[] args) {

		Vehicle.Car c = new Vehicle.Car();
		System.out.println(c.getnoofWheels());
		
		Buss b = new Buss();
		System.out.println(b.getnoofWheels());
	}
}

interface Vehicle {
	public int getnoofWheels();

	class Car implements Vehicle {

		@Override
		public int getnoofWheels() {
			System.out.println("car class ");
			return 4;
		}
	}
}

class Buss implements Vehicle {

	@Override
	public int getnoofWheels() {
		System.out.println("Bus class");
		return 6;
	}

}