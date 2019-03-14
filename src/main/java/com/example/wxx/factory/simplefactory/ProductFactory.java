package com.example.wxx.factory.simplefactory;

import com.example.wxx.singleton.Client;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class ProductFactory {

    public  <T extends Product> T create(Class<T> product) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T o = (T)Class.forName(product.getName()).newInstance();
        return o;
    }

}
