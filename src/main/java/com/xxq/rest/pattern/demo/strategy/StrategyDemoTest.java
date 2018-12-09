package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: StrategyDemoTest
 * @ProjectName pattern-strategy-demo
 * @Description: 策略模式，即多态的使用
 * @date 2018-12-09 23:44
 */
public class StrategyDemoTest {
    public static void main(String[] args) {

        Context context = new Context(new AddOperation());
        context.executeStrategy(1.2, 2.4);


        Context context1 = new Context(new SubTractOperation());
        context1.executeStrategy(2.0, 1.0);


    }
}
