package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午4:53
 **/
public class Test implements Runnable{

    private boolean flag;

    public Test(boolean flag){
        this.flag = false;
    }

    public void run(){
        if(flag){
            while (true)
              synchronized(MyLock.locka){
                  System.out.println(Thread.currentThread().getName() + "...if  locka......");
                  synchronized(MyLock.lockb){
                      System.out.println(Thread.currentThread().getName() + "...if  lockb......");
                  }
              }
        } else {
            while (true)
                synchronized(MyLock.lockb){
                    System.out.println(Thread.currentThread().getName() + "...else  lockb......");
                    synchronized(MyLock.locka){
                        System.out.println(Thread.currentThread().getName() + "...else  locka......");
                    }
                }
        }
    }

}
