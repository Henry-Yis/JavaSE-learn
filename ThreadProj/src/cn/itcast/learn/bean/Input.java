package cn.itcast.learn.bean;

/**
 * @Description 输入
 * @Author yishuai
 * @Date 2020/12/7 下午5:30
 **/
public class Input implements Runnable {

    Resource r;

    public Input(Resource resource){
        this.r = resource;
    }

    @Override
    public void run() {

        int x = 0;

        while (true){
            synchronized (r) {
                if(r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x == 0) {
                    r.name = "mike";
                    r.sex = "nan";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女女女";
                }
                r.flag = true;
                r.notify();
            }
            x = (x + 1) % 2;
            System.out.println("in---" + r.name + "..." + r.sex);
        }
    }
}
