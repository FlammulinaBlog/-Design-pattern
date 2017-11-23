package com.FlammulinaBlog.多个工厂模式;

public class SendFactory {
	
    public Sender produceMail(){  
        return new MailSender();  
    }  
	      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
