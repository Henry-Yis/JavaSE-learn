package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午7:38
 **/
public class Res {

    private String name;
    private int count = 1;
    private boolean flag = false;
    public synchronized void set(String name){
        if(flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "..生产者.." + this.name);
        flag = true;
        notify();

    }

    public synchronized  void out(){
        if(!flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName() + "....消费者...." + this.name);
        flag = false;
        notify();
    }
}
