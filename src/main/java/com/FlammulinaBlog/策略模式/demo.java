package com.FlammulinaBlog.策略模式;

/**
 * @descriptions:
 * @author: HanYanBing
 * @date: 2021/3/1 17:28
 * @version: 1.0
 */
public class demo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }

}
