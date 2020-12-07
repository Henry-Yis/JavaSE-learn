package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午3:07
 **/
public class Cus implements  Runnable {

    Bank b = new Bank();

    @Override
    public void run() {
        for (int x=0; x<3; x++){
            b.add(100);
        }
    }
}
