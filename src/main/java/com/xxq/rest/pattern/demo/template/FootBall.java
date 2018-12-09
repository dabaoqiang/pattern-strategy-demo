package com.xxq.rest.pattern.demo.template;

/**
 * @author xiaoqiang
 * @Title: FootBall
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-10 00:12
 */
public class FootBall extends Play {

    public void initialize() {
        System.out.println("初始化足球");
    }

    public void startPlay() {
        System.out.println("开始提足球");
    }

    public void endPlay() {
        System.out.println("结束提足球");
    }
}
