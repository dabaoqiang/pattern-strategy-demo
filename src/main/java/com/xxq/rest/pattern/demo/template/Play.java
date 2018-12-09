package com.xxq.rest.pattern.demo.template;

/**
 * @author xiaoqiang
 * @Title: Play
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-10 00:01
 */
public abstract class Play {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    /**
     * 定义模板方法
     */
    public void playTemplate() {
        try {
            initialize();
            startPlay();
            endPlay();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
