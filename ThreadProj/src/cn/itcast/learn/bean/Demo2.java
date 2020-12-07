package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 上午10:56
 **/
public class Demo2 implements Runnable{

    public void run(){
        show();
    }

    private void show(){
        for(int x=0; x<20; x++){
            System.out.println(Thread.currentThread().getName()+"....."+x);
        }
    }

}
