package com.xworkz.commonmodule.javamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSender {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail() {

		SimpleMailMessage mailMessage = new SimpleMailMessage();
		String[] bccs = { "preranam.xworkz@gmail.com", "varsha.xworkz@gmail.com" };
		mailMessage.setFrom("rakshithar.xworkz@gmail.com");
		mailMessage.setTo("varalakshmi.xworkz@gmail.com");
		mailMessage.setCc("rakshitharajendra99@gmail.com");
		mailMessage.setBcc(bccs);
		mailMessage.setSubject("Demo Java Mail Sender");
		mailMessage.setText("Hi \n Hello \n How are you");

		javaMailSender.send(mailMessage);

	}
}
