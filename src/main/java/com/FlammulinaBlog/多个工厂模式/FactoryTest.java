package com.FlammulinaBlog.多个工厂模式;

public class FactoryTest {
	 public static void main(String[] args) {  
	        SendFactory factory = new SendFactory();  
	        Sender sender = factory.produceSms();  
	        sender.Send();
	    }  
}
