package com.FlammulinaBlog.访问者模式;

public class MyVisitor implements Visitor {
    //@Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
