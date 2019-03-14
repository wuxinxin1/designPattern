package com.example.wxx.singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Created by IntelliJ IDEA.
 *  用于测试单例模式
 * @author: wuxinxin
 * @date: 2019/3/14
 */
public class Client {

    /**
     * 测试饿汉式
     */
    @Test
    public void  test1(){

        System.out.println(Singleton_1.getInstance());
        System.out.println(Singleton_1.getInstance());
        System.out.println(Singleton_1.getInstance());


    }

    /**
     * 测试懒汉式
     */
    @Test
    public void test2(){
        System.out.println(Singleton_2.getInstance());
        System.out.println(Singleton_2.getInstance());
        System.out.println(Singleton_2.getInstance());
    }

    class  T implements Runnable{

        @Override
        public void run() {
            System.out.println(Singleton_2.getInstance());
        }
    }

    /**
     * 多线程测试懒汉式
     */
    @Test
    public void test3(){
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        Thread t3 = new Thread(new T());
        t1.start();
        t2.start();
        t3.start();
    }

    /**
     * 试图通过别的方式创建实例
     */
    @Test
    public void test4() throws Exception {
        /**
         * 因为构造器私有化，所以无法创建对象，甚至无法创建子类对象
         */
        //new Singleton_1();

        /**
         * 通过反射方式创建对象
         */
        Class<?> aClass = this.getClass().getClassLoader().loadClass("com.example.wxx.singleton.Singleton_1");

        Constructor constructor = aClass.getDeclaredConstructor(null);
        constructor.setAccessible(true);


        Object o = constructor.newInstance(null);


        if(o instanceof Singleton_1){
            System.out.println("反射创建:"+o);
        }

        System.out.println("单例构建:"+Singleton_1.getInstance());
        System.out.println("单例构建:"+Singleton_1.getInstance());

    }

    /**
     * 通过序列化反序列化来获取新的单例对象
     */
    @Test
    public  void test5() throws Exception{

        //创建单例对象
        Singleton_1 singleton1 = Singleton_1.getInstance();
        System.out.println("序列化前:"+singleton1);

        //将对象进行序列化
        FileOutputStream fileOutputStream=new FileOutputStream("object.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton1);

        //反序列化
        FileInputStream fileInputStream=new FileInputStream("object.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();

        if(o instanceof Singleton_1){
            System.out.println("序列化后:"+o);
        }

    }

    /**
     * 通过实现Cloneable接口达到克隆新实例
     */
    @Test
    public void test6() throws Exception{
        Singleton_1 instance = Singleton_1.getInstance();
        System.out.println("克隆前:"+instance);
        Object o = instance.clone();

        if(o instanceof Singleton_1){
            System.out.println("克隆后"+o);
        }


    }

}
