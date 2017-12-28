package com.FlammulinaBlog.中介者模式;

public class Test {
	 public static void main(String[] args) {
	        Mediator mediator = new MyMediator();
	        mediator.createMediator();
	        mediator.workAll();
	    }
}
