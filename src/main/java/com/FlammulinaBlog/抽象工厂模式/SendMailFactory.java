package com.FlammulinaBlog.抽象工厂模式;

public class SendMailFactory implements Provider {

	public Sender produce() {
		 return new MailSender();  
	}

}
