package com.FlammulinaBlog.静态工厂模式;

public class SendFactory {
	
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
