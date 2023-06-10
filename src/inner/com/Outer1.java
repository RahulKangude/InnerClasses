package inner.com;

public class Outer1 {
	
	public static void main(String[] args) {
     	Out1 o=new Out1();
		Out1.Inner1 i = o.new Inner1();
		 i.Add();
	}
}

class Out1{
	static {
		System.out.println("Static block");
	}
	class Inner1 
	{
		public void Add()
		{
			System.out.println("Inside Inner class Add method");
		}
	}

	{
		Inner1 i=new Inner1();
		System.out.println("inside instance block");
		i.Add();
	}
}