package cn.itcast.learn.bean;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午7:38
 *
 * if判断标记，只有一次，会导致不该运行的线程运行，出现了数据错误的情况。
 * while判断标记，解决了线程获取执行权后，是否要运行！
 *
 * notify只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致死锁。
 * nitifyAll解决了，本方线程一定会唤醒对方线程的问题。
 *
 **/
public class Res {

    private String name;
    private int count = 1;
    private boolean flag = false;

    //创建一个锁对象
    Lock lock = new ReentrantLock();

    //通过已有的锁获取该锁上的监视器对象。
    Condition con = lock.newCondition();

    public void set(String name){
        lock.lock();
        try {
            while (flag){
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "..生产者.." + this.name);
            flag = true;
            con.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void out(){
        lock.lock();
        try {
            while (!flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "....消费者...." + this.name);
            flag = false;
            con.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
