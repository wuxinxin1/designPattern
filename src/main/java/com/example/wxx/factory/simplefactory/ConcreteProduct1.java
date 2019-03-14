package com.example.wxx.factory.simplefactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void method1() {
        System.out.println("ConcreteProduct1--method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteProduct1--method2");
    }
}
