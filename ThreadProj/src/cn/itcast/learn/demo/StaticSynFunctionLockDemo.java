package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Ticket;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午4:05
 **/
public class StaticSynFunctionLockDemo {

    public static void main(String[] args) {
        Ticket t = new Ticket();//创建一个线程任务对象

//        Class clazz = t.getClass();
//        Class clazz = Ticket.class;

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();

        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
        }

        t.flag = false;
        t2.start();
    }
}
