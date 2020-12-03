package cn.itcast.learn.list.linklist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 下午1:10
 **/
public class LinkListDemo {

    public static void main(String[] args) {

        LinkedList link = new LinkedList();

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        link.addFirst("abc4");

        System.out.println(link);

        link.add("abc9");
        link.add("abc8");

        System.out.println(link);

        link.add(4,"abc00");
        link.add(2,"abc00");

        System.out.println(link);

        link.set(4,"abcd");

        System.out.println(link);

    }

}
