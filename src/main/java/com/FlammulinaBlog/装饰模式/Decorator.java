package com.FlammulinaBlog.装饰模式;

public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {

		super();

		this.source = source;

	}

	public void method() {

		System.out.println("before decorator!");

		source.method();

		System.out.println("after decorator!");

	}

}