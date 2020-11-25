package com.imooc.singleton;

/**
 * @Description 懒汉式：类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始化操作
 *                  时间换空间   线程不安全
 *                  解决线程不安全的方法：1、同步锁 2、双重校验锁 3、静态内部类 4、枚举
 * @Author yishuai
 * @Date 2020/11/25 下午5:43
 **/
public class SingletonTwo {

    //1.创建类中私有构造
    private SingletonTwo(){

    }
    //2.创建静态的该类实例对象
    private static SingletonTwo instance = null;

    //3.创建开放的静态方法提过实例对象
    public static SingletonTwo getInstance(){
        if(instance==null)
            instance = new SingletonTwo();
        return instance;
    }

}
