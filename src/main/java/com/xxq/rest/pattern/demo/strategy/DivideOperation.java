package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: DivideOperation
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-09 18:07
 */
public class DivideOperation implements Operation {

    public Double operationNum(Double number1, Double number2) {
        System.out.println("除法操作算法进行");
        return number1 / number2;
    }
}
