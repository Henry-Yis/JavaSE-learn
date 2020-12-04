package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Demo;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午4:35
 **/
public class ThreadDemo2 {

    public static void main(String[] args) {

//        Thread t1 = new Thread();

        Demo d1 = new Demo("张三");
        Demo d2 = new Demo("tom");

        d1.run();
        System.out.println("haha");
        d2.run();

    }

}
