package com.FlammulinaBlog.适配器模式.对象适配器;

import com.FlammulinaBlog.适配器模式.Source;
import com.FlammulinaBlog.适配器模式.Targetable;

public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {

		super();

		this.source = source;

	}

	public void method2() {

		System.out.println("this is the targetable method!");

	}

	public void method1() {

		source.method1();

	}

}