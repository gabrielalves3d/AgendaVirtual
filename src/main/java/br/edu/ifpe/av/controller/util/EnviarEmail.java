package br.edu.ifpe.av.controller.util;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarEmail {
	
	
	public void postMail(String recipient, String subject, String message, String from) {
		boolean debug = false;

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Authenticator auth = new SMTPAuthenticator();
		Session session = Session.getDefaultInstance(props, auth);

		session.setDebug(debug);

		Message msg = new MimeMessage(session);

		InternetAddress addressFrom;
		try {
			addressFrom = new InternetAddress(from);

			msg.setFrom(addressFrom);

			InternetAddress[] addressTo = new InternetAddress[1];
			addressTo[0] = new InternetAddress(recipient);
			msg.setRecipients(Message.RecipientType.TO, addressTo);

			msg.setSubject("Alerta - Agendamento");
			msg.setContent(message, "Verfique seus agendamentos no sistema");
			Transport.send(msg);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			String username = "ppo.agendavirtual@gmail.com"; 	
			String password = "agendavirtual";
			return new PasswordAuthentication(username, password);
		}
	}
	public static void main(String[] args) {
		EnviarEmail enviar = new EnviarEmail();
		enviar.postMail("ppo.agendavirtual@gmail.com", "Alerta - Agendamento", "Verfique seus agendamentos no sistema", "ramosavanessa@gmail.com");
	}


}


