package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: MultiplyOperation
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-09 18:06
 */
public class MultiplyOperation implements Operation {
    public Double operationNum(Double number1, Double number2) {
        System.out.println("乘法操作进行中");
        return number1 * number2;
    }
}
