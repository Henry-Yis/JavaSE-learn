package cn.itcast.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午3:18
 **/
public class GenericDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("abc");
        al.add("ggd");

        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }

}
