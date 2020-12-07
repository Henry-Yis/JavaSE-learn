package cn.itcast.learn.bean;

/**
 * @Description 输出
 * @Author yishuai
 * @Date 2020/12/7 下午5:31
 **/
public class Output implements Runnable {

    Resource r;

    public Output(Resource resource){
        this.r = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if(!r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("out===" + r.name + "..." + r.sex);
                r.flag = false;
                r.notify();
            }
        }
    }
}
