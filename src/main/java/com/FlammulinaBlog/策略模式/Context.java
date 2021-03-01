package com.FlammulinaBlog.策略模式;

/**
 * @descriptions:
 * @author: HanYanBing
 * @date: 2021/3/1 17:27
 * @version: 1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
