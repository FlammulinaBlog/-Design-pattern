package com.FlammulinaBlog.适配器模式.对象适配器;

import com.FlammulinaBlog.适配器模式.Source;
import com.FlammulinaBlog.适配器模式.Targetable;

public class AdapterTest {
	public static void main(String[] args) {

		Source source = new Source();

		Targetable target = new Wrapper(source);

		target.method1();

		target.method2();

	}
}
