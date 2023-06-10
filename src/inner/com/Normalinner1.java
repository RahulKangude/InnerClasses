package inner.com;

public class Normalinner1 {
public static void main(String[] args) {
//	X a=new X();
//	X.Y b=a.new Y();
//	X.Y.Z c=b.new Z();
	X.Y.Z.ZZ j =new X().new Y().
			new Z().new ZZ();
	j.Add();
}
}

class X{
	class Y{
		class Z{
			class ZZ{
				public void Add() {
					System.out.println("Inter most class method ");
					}
			}
			}
		}
	}
