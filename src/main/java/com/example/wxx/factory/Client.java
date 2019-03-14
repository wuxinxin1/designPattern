package com.example.wxx.factory;

import com.example.wxx.factory.factorymethod.ConcreteCreator;
import com.example.wxx.factory.factorymethod.ConcreteProduct;
import com.example.wxx.factory.factorymethod.Creator;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * 测试工厂设计模式
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class Client {


    /**
     * 工厂方法
     */
    @Test
    public void test1() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        //创建具体工厂
        Creator creator=new ConcreteCreator();

        //使用具体工厂的具体实现去创建对象
        ConcreteProduct  concreteProduct= creator.factory(ConcreteProduct.class);

        System.out.println(concreteProduct);

        concreteProduct.method1();
        concreteProduct.method2();
    }
}
