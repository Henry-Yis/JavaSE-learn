package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Cus;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午3:08
 **/
public class BankDemo {

    public static void main(String[] args) {

        Cus c = new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }

}
