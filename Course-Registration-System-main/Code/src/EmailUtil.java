import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtil {
    public static void sendVerificationEmail(String toEmail, String code) {
        final String fromEmail = "shanaldocarty937@gmail.com"; // your Gmail
        final String password = "ttti migb iytk nbjg";     // your app password

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Reset Your Password");
            message.setText(
                    "Dear User,\n\n" +
                            "We received a request to reset your password for the Course Registration System.\n" +
                            "Please use the verification code below to proceed:\n\n" +
                            "Verification Code: " + code + "\n\n" +
                            "If you did not initiate this request, please ignore this email.\n\n" +
                            "Best regards,\n" +
                            "Course Registration Support Team"
            );
            Transport.send(message);
        } catch (MessagingException e) {
            System.out.println("Failed to send email: " + e.getMessage());
        }
    }
}
