package com.xxq.rest.pattern.demo.template;

/**
 * @author xiaoqiang
 * @Title: Cricket
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-10 00:14
 */
public class Cricket extends Play {
    public void initialize() {
        System.out.println("板球初始化");
    }

    public void startPlay() {
        System.out.println("开始板球");
    }

    public void endPlay() {
        System.out.println("结束板球");
    }
}
