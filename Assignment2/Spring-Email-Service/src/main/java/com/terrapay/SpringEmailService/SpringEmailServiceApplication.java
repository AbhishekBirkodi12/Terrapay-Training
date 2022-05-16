package com.terrapay.SpringEmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailServiceApplication {

	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailServiceApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendSimpleEmail("abhispringboot8@gmail.com",
				"This is the email body",
				"This is the email subject test");

		service.sendEmailWithAttachment("abhispringboot8@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"C:\\Users\\AbhishekBirkodi\\Pictures\\WifiDriver.PNG");

	}

}
