package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: AddOperation
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-09 18:02
 */
public class AddOperation implements Operation {

    public Double operationNum(Double number1, Double number2) {
        System.out.println("在进行加法操作！");
        return number1 + number2;
    }
}
