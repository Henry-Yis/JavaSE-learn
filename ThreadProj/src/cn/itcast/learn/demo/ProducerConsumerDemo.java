package cn.itcast.learn.demo;

import cn.itcast.learn.bean.Consumer;
import cn.itcast.learn.bean.Producer;
import cn.itcast.learn.bean.Res;

/**
 * @Description 生产者、消费者
 * @Author yishuai
 * @Date 2020/12/7 下午7:37
 **/

/**
 * 多生产者、多消费者
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Res r = new Res();

        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t0 = new Thread(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t0.start();
        t1.start();
        t2.start();
        t3.start();

    }

}
