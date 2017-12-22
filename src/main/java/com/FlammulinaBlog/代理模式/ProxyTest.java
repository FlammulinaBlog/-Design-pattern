package com.FlammulinaBlog.代理模式;

public class ProxyTest {
	public static void main(String[] args) {

		Sourceable source = new Proxy();

		source.method();

	}

}
