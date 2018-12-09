package com.xxq.rest.pattern.demo.strategy;

/**
 * @author xiaoqiang
 * @Title: Context
 * @ProjectName pattern-strategy-demo
 * @Description: TODO
 * @date 2018-12-09 23:41
 */
public class Context {

    private Operation operation;

    public Context(Operation operation) {
        this.operation = operation;
    }

    /**
     * 根据不同的算法调用不同的操作
     *
     * @param number1
     * @param number2
     */
    public void executeStrategy(Double number1, Double number2) {
        System.out.println("结果是：" + operation.operationNum(number1, number2));
    }
}
