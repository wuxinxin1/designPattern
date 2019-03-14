package com.example.wxx.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T  factory(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T product = (T)Class.forName(c.getName()).newInstance();
        return product;
    }
}
