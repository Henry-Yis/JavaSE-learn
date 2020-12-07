package cn.itcast.learn.bean;

/**
 * @Description 多线程下的单例
 * @Author yishuai
 * @Date 2020/12/7 下午4:18
 **/

/**
 * 饿汉式
 */
/*public class Single {

    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}*/

/**
 * 懒汉式
 */
class Single{
    private static Single s = null;
    private Single(){}
    public static Single getInstance(){
     if(s == null){
         synchronized (Single.class){
             if(s == null)
             s = new Single();
         }
     }
     return s;
    }
}
