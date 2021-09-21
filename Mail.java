//import java.net.InetAddress;
//import java.util.Properties;
//
////import javax.mail.Message.RecipientType;
////import javax.mail.Session;
////import javax.mail.Transport;
////import javax.mail.internet.InternetAddress;
////import javax.mail.internet.MimeMessage;
//
//class Mail{
//	public static void main(String[] args) {
//
//		Properties props = new Properties();
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.port","465");
//		props.put("mail.smtp.user", "jaydipmakwana654@gmail.com");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.debug", true);
//		props.put("mail.smtp.socketFactory.port", 465);
//		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		props.put("mail.smtp.socketFactory.fallback", "false");
//		try {
//			//Take the Session id from the google
//			Session session = Session.getDefaultInstance(props,null);
//			session.setDebug(true);
//			MimeMessage message = new MimeMessage(session);
//			message.setText("Jaydip");
//			message.setSubject("Jaydip");
//			message.setFrom(new InternetAddress("jaydipmakwana654@gmail.com"));
//
//
//			//Client Email_Id
//			message.addRecipient(RecipientType.TO, new InternetAddress("2018itjay06@ldce.ac.in"));
//			message.saveChanges();
//
//
//			//Transform messsage to the client mail server
//			Transport transport = session.getTransport("smtp");
//
//			transport.connect("smtp.gmail.com","jaydipmakwana654@gmail.com","tGiTMuFBfMS,2019.");
//			transport.sendMessage(message, message.getAllRecipients());
//			transport.close();
//
//			System.out.println("Suscessful send");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//
//
//	}
//}