package com.example.wxx.singleton;

/**
 * Created by IntelliJ IDEA.
 *  编写饿汉式单例模式
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class Singleton_2 {

    private static Singleton_2 singleton=null;

    /**
     * 构造函数初始化，防止构建对象
     */
    private Singleton_2(){

    }

    public static synchronized Singleton_2 getInstance(){
        if(singleton==null){
            singleton=new Singleton_2();
        }
        return singleton;
    }

}
