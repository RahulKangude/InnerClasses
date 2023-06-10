package anonymus.innerclass;

public class Approch2 {//Anonymous inner class implements interface
   public static void main(String[] args) {
	Runnable r=new Runnable() {
		
		@Override
		public void run() {
	    for (int i = 0; i < 50; i++) {
			System.out.println("Runnable Anonymous innerclass");
		}
			
		}
	};
	Thread t1=new Thread(r);
	t1.start();
	for (int i = 0; i < 50; i++) {
		System.out.println("main Thread ");
	}
	
}

}
