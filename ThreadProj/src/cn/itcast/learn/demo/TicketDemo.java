package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Ticket;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午1:08
 **/
public class TicketDemo {

    public static void main(String[] args) {

        Ticket t = new Ticket();//创建一个线程任务对象

        Thread t1 = new Thread(t);

        Thread t2 = new Thread(t);
//        Thread t3 = new Thread(t);
//        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
//        t3.start();
//        t4.start();

    }

}
