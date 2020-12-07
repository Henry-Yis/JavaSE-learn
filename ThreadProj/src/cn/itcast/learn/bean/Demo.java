package cn.itcast.learn.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午4:25
 **/
public class Demo extends Thread {

    private String name;

    public Demo(String name){
//        this.name = name;
        super(name);
    }


    public void run(){
        show();
    }

    private void show(){
//        int[] arr =  new int[3];
//        arr[3] = 10;
        for(int x=0; x<10; x++)
            System.out.println(name + "....x=" + x + "-----" + Thread.currentThread().getName());
    }

}
