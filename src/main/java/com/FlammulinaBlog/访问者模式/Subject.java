package com.FlammulinaBlog.访问者模式;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
