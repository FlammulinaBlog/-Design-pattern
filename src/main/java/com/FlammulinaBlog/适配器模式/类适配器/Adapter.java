package com.FlammulinaBlog.适配器模式.类适配器;

import com.FlammulinaBlog.适配器模式.Source;
import com.FlammulinaBlog.适配器模式.Targetable;

public class Adapter extends Source implements Targetable {

	  public void method2() {
        System.out.println("this is the targetable method!");
      }
}
