package com.FlammulinaBlog.策略模式;

/**
 * @descriptions:
 * @author: HanYanBing
 * @date: 2021/3/1 17:27
 * @version: 1.0
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
