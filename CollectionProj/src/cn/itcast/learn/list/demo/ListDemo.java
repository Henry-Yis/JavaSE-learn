package cn.itcast.learn.list.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 上午9:44
 **/
public class ListDemo {


    public static void main(String[] args) {

        List list = new ArrayList();
        show(list);

    }

    public static void show(List list){

        //添加
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println(list);

        //插入
        list.add(1,"abc9");
        System.out.println(list);

        //删除
        System.out.println("remove:" + list.remove(2));

        System.out.println(list);

        //修改
        System.out.println("set:" + list.set(1,"abc8"));
        System.out.println(list);

        //获取
        System.out.println("get:" + list.get(2));
        System.out.println(list);

        //获取子列表
        System.out.println("sublist:" + list.subList(1,3));
        System.out.println(list);

        list.add("abc8");
        System.out.println("indexOf:" + list.indexOf("abc8"));
        System.out.println("indexOf:" + list.lastIndexOf("abc8"));


        System.out.println(list);


    }

}
