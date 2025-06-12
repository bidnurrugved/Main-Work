package com.tka.june;

import java.util.Properties;
import 
import javax.mail.internet.*;

public class EmailAutomation {

    public static <Message> void main(String[] args) {

        final String senderEmail = "bidnur.rugved@gmail.com";
        final String appPassword = "qmdiqzbihkiuqnlz"; // 16-digit app password

        String to = "265@thekiranacademy.com";

      
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

    
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
         
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Thank You for Your Selenium Guidance");

            String body = """
                    Hello Sagar Sir,

                    I hope you're doing absolutely great.

                    Thank you so much for teaching Selenium testing so well.
                    You have made it truly easier and enjoyable for us to understand.

                    Regards,
                    Rugved
                    """;

            message.setText(body);

          
            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}