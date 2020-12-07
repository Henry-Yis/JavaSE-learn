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
            if (x == 0) {
               r.set("mike","nan");
            } else {
                r.set("丽丽","女女女女");
            }
            x = (x + 1) % 2;

        }
    }
}
