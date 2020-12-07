package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Demo;
import cn.itcast.learn.bean.Demo2;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 上午10:58
 **/
public class ThreadDemo3 {

    public static void main(String[] args) {

        Demo2 d = new Demo2();

        Thread t1 = new Thread(d,"旺财");
        Thread t2 = new Thread(d,"xiaoqiang");
        t1.start();
        t2.start();

    }

}
