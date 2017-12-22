package com.FlammulinaBlog.适配器模式.类适配器;

import com.FlammulinaBlog.适配器模式.Targetable;

public class AdapterTest {

	public static void main(String[] args) {

		Targetable target = new Adapter();

		target.method1();

		target.method2();

	}
}
