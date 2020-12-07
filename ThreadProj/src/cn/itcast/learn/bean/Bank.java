package cn.itcast.learn.bean;

/**
 * @Description 储户，两个，每个都到银行存现，每次存100，共存三次。
 * @Author yishuai
 * @Date 2020/12/7 下午3:05
 **/
public class Bank {

    private int sum;

    private Object obj = new Object();

    public synchronized void add(int num){ //同步函数
//        synchronized (obj){
            sum = sum + num;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            System.out.println("sum=" + sum);
//        }
    }


}
