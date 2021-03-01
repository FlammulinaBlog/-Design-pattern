package com.FlammulinaBlog.模板模式;

/**
 * @descriptions: 设备
 * @author: HanYanBing
 * @date: 2021/3/1 17:18
 * @version: 1.0
 */
public class Device_Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
