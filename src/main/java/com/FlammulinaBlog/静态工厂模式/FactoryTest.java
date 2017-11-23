package com.FlammulinaBlog.静态工厂模式;

public class FactoryTest {
	 public static void main(String[] args) {  
		 Sender sender = SendFactory.produceMail();  
         sender.Send();  
	    }  
}
