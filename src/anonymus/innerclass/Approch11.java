package anonymus.innerclass;

public class Approch11 {
 public static void main(String[] args) {
	Thread t1=new Thread() {
		@Override
		public void run() {
		for (int i = 0; i <10;i++) {
			System.out.println("child thread");
		}
		}
	};
	t1.start();
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Main thread ");
		
	}
}
}
