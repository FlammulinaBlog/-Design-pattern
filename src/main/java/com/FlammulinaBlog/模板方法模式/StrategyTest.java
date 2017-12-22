package com.FlammulinaBlog.模板方法模式;

public class StrategyTest {
	public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
