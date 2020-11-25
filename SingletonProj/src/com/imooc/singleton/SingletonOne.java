package com.imooc.singleton;

/**
 * @Description 饿汉式：创建对象实例的时候直接初始化
 *              空间换时间   线程安全
 * @Author yishuai
 * @Date 2020/11/25 下午5:35
 **/
public class SingletonOne {

    //1.创建类中私有构造
    private SingletonOne(){

    }
    //2.创建静态的该类实例对象
    private static SingletonOne instance = new SingletonOne();

    //3.创建公有静态方法返回静态实例对象
    public static SingletonOne getInstance(){
        return instance;
    }

}
