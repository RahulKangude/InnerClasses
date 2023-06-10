package anonymus.innerclass;

public class Approch3 {/// Anonymous inner class define Arguments
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Welcome to Runnableinner class");
			}
		}).start();

	}
}
