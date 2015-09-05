package jrout.tutorial.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {
	public static void main(String[] args) {

		final String username = "username";
		final String password = "password";
		final String recipientsEmail = "test@gmail.com"; 
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(recipientsEmail));
			message.setSubject("Test email from Jayram");
			message.setText("Hello Students," + "\n\n Enjoy learning sending Emails!");

			Transport.send(message);

			System.out.println("Email has been sent successfully");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
