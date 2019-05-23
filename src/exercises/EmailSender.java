package exercises;


import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		
		String email = JOptionPane.showInputDialog("Enter email address of the recipient:");
		setEmailAddress(email);
		String message = JOptionPane.showInputDialog("Now, enter message, please:");
		if (send(message) && isValid(email))
			JOptionPane.showMessageDialog(null, "Email is corectly sent");
		else
			JOptionPane.showMessageDialog(null, "The email did not send correctly, please try again");

	}
	boolean isValid(String email) {
		if (!(this.emailAddress.contains("@") && this.emailAddress.contains("."))) {
			System.err.println("Invalid email address, please enter the correct one email");
			return false;
		}
		else 
			return true;
	}

	boolean send(String greeting) {
		if (this.emailAddress.isEmpty()) {
			System.err.println("Dude, you did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
