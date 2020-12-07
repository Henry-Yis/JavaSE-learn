package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Demo;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午4:35
 **/
public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {

//        Thread t1 = new Thread();

        Demo d1 = new Demo("张三");
        Demo d2 = new Demo("tom");

       d1.start();
       Thread.sleep(1000);
       d2.start();

//       System.out.println(4/0);

       for(int x=0; x<20; x++){
           System.out.println("over..." + Thread.currentThread().getName());
       }

    }

}
