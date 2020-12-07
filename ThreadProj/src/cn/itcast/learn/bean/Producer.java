package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/7 下午7:43
 **/
public class Producer implements Runnable {

    private Res r;

    public Producer(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true)
            r.set("烤鸭");
    }

}
