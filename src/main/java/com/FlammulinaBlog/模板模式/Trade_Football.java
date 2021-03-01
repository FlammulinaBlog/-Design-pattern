package com.FlammulinaBlog.模板模式;

/**
 * @descriptions: 交易
 * @author: HanYanBing
 * @date: 2021/3/1 17:19
 * @version: 1.0
 */
public class Trade_Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
