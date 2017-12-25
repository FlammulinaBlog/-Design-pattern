package com.FlammulinaBlog.迭代子模式;

public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    //@Overrid
    public Iterator iterator() {
        return new MyIterator(this);
    }
    //@Override
    public Object get(int i) {
        return string[i];
    }
    //@Override
    public int size() {
        return string.length;
    }
}