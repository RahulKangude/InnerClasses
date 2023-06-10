package staticinnerclass.com;

//interface inside a class
public class Classinterface implements Email {
	public static void main(String[] args) {
		Classinterface c = new Classinterface();
		c.SendEmail(null);
	}

	@Override
	public void SendEmail(EmailDetails e) {
		System.out.println("Send Email method ");
	}
}

interface Email {
	public void SendEmail(EmailDetails e);

	class EmailDetails {
		String name;
		String to_cc;
		String subject;
	}
}
