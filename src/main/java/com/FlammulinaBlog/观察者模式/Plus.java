package com.FlammulinaBlog.观察者模式;

public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}
