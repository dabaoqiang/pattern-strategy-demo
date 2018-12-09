package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: Operation
 * @ProjectName pattern-strategy-demo
 * @Description: 策略模式，加，减，乘，除，根据用户的不同选择调用不同的方法；
 * @date 2018-12-09 17:59
 */
public interface Operation {

    /**
     * 操作数据
     * @param number1
     * @param number2
     * @return
     */
    public Double operationNum(Double number1, Double number2);

}
