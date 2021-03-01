package com.FlammulinaBlog.模板模式;

/**
 * @descriptions:
 * @author: HanYanBing
 * @date: 2021/3/1 17:18
 * @version: 1.0
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        // 入参校验
        initialize();

        // 规则校验
        startPlay();

        // 保存日志
        endPlay();
    }
}
