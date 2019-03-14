package com.example.wxx.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * 抽象工厂
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public interface Creator {

    /**
     * 用于创建Product类型的对象
     * @param c
     * @param <T>
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T extends Product> T factory(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

}
