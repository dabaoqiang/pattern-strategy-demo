package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: SubTractOperation
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-09 18:04
 */
public class SubTractOperation implements Operation {

    public Double operationNum(Double number1, Double number2) {
        System.out.println("减法算法操作!");
        return number1 - number2;
    }
}
