package inner.com;

public class Methodinner {
	public static void main(String[] args) {
		Pavilion pi = new Pavilion();
		pi.Hp();
	}
}

class Pavilion {
	public static void Hp() {
		int a = 47;
		class Ic {
			public void Add(int i,int j) {
				System.out.println(a);
				 System.out.println("the sum is= "+(i+j));
			}
		}
		Ic p = new Ic();
	//	p.Add();
	  p.Add(15, 40);
//		p.Add(1, 40);
	}
}