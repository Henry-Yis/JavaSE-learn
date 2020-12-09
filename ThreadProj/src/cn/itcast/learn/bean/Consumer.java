package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午7:44
 **/
public class Consumer implements Runnable {

    private Res r;

    public Consumer(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.out();
        }
    }
}
