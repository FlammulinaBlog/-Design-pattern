package com.FlammulinaBlog.单例模式;

public class Singleton1 {

	private static Singleton1 instance = null;

	private Singleton1() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton1();
		}
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;

	}

}
