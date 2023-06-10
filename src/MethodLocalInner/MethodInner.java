package MethodLocalInner;

public class MethodInner {
	final int i=10; ///if declared as final it acess
	static int y=100;
	public 
	void add() {
		class Inner2 {
			public void m2() {
				System.out.println(i+" "+y);
			}
		}
	  Inner2 i=new Inner2();
	  i.m2();
	}
	public static void main(String[] args) {
       MethodInner m=new MethodInner();
       m.add();
	}
}
