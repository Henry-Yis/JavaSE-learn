package cn.itcast.learn.bean;

/**
 * @Description 资源
 * @Author yishuai
 * @Date 2020/12/7 下午5:28
 **/
public class Resource {

    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex){
        if (flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name;
        this.sex = sex;
//        System.out.println("in----" + name + "..." + sex);
        flag = true;
        this.notify();
    }

     public synchronized void out(){
        if(!flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         System.out.println("out====" + name + "..." + sex);
            flag = false;
            notify();
     }
}
