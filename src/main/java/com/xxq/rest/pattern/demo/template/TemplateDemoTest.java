package com.xxq.rest.pattern.demo.template;

/**
 * @author xiaoqiang
 * @Title: TemplateDemoTest
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-10 00:15
 */
public class TemplateDemoTest {

    public static void main(String[] args) {
        Play play = new FootBall();
        play.playTemplate();

        Play play1 = new Cricket();
        play1.playTemplate();
    }
}
