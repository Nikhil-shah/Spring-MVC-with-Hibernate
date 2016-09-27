package com.sunbeam.rest.webservices.utilities;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS 
{
	public Boolean mailMe(String sendTo, String msg) 
	{
		Boolean success = false;
		System.out.println("1");
		final String username = "campusportal41@gmail.com";
		final String password = "campusportal41campus";
		System.out.println("2");
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.user", username);
		props.put("mail.smtp.password", password);
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		System.out.println("3");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() 
		{
			protected PasswordAuthentication getPasswordAuthentication() 
			{
				return new PasswordAuthentication(username, password);
			}
		});
		
		System.out.println("4");

		try 
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("campusportal41@gmail.com"));
			System.out.println("5");
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(sendTo));
			message.setSubject("Reminder for Password");
			System.out.println("6");
//			message.setText(" Hello "+sendTo+"\n Thankyou for visiting Campus Portal, we will come to you as soos as possible\n\t -This mail is generated by Campus Portal!! :)");
//			message.setText("Hello "+sendTo+",\n\n\n Your password for Campus portal account is \""+msg+"\"\n\n\n\n\t -****This mail is generated by Campus Portal!");
			message.setText(msg);
			
			System.out.println("7");
			Transport.send(message);
			System.out.println("8");
			success = true;
			System.out.println("9");
		}
		catch (MessagingException e) 
		{
			System.out.println("inside 8");
			System.out.println(e);
			return success;
			
		}
		return success;
	}
}