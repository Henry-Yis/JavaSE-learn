package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Test;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午4:53
 **/
public class DeadLockTest {

    public static void main(String[] args) {

        Test a = new Test(true);
        Test b = new Test(false);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }

}
