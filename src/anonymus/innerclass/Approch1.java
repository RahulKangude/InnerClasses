package anonymus.innerclass;

public class Approch1 {/// Anonymuos inner class that extends a nomal class
	public static void main(String[] args) {

		Popcorn p = new Popcorn();
		p.taste();

		Popcorn p1 = new Popcorn() {
			public void taste() {
				System.out.println(" child of popcorn p1 taste method");
			}
		};
		p1.taste();

		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println(" child of popcorn p2 taste method");
			}
		};
		p2.taste();
		
		System.out.println("\nAnonymous inner classes name--->>\n");
		System.out.println(p.getClass().getName());//anonymus.innerclass.Popcorn
		System.out.println(p1.getClass().getName());//anonymus.innerclass.Approch1$1
		System.out.println(p2.getClass().getName());//anonymus.innerclass.Approch1$2


	}
}

class Popcorn {
	public void taste() {
		System.out.println("Popcorn class  taste method");
	}
}