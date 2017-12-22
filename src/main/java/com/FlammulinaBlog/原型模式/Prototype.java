package com.FlammulinaBlog.原型模式;

public class Prototype implements Cloneable {
	 
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
 
}