package com.example.wxx.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class ConcreteProduct implements Product {
    @Override
    public void method1() {
        System.out.println("ConcreteProduct--method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteProduct--method2");
    }
}
