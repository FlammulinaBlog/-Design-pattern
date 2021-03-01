package com.FlammulinaBlog.模板模式;

/**
 * @descriptions:
 * @author: HanYanBing
 * @date: 2021/3/1 17:19
 * @version: 1.0
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Device_Cricket();
        game.play();
        System.out.println("===============");
        game = new Trade_Football();
        game.play();

    }

}
