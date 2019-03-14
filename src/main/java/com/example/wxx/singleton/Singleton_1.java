package com.example.wxx.singleton;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *  编写饿汉式单例模式
 * @author: wuxinxin
 * @date: 2019/3/14
 */
//public class Singleton_1 {
//public class Singleton_1 implements Serializable {
public class Singleton_1 implements Cloneable{

    private static Singleton_1 singleton=new Singleton_1();

    /**
     * 构造函数初始化，防止构建对象
     */
    private Singleton_1(){
    }

    public static Singleton_1 getInstance(){
        return singleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }

}
