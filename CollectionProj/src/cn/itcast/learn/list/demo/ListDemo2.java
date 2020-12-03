package cn.itcast.learn.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 上午10:02
 **/
public class ListDemo2 {

    public static void main(String[] args) {

        List list = new ArrayList();
//        show(list);


        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            Object obj = it.next();
//            if(obj.equals("abc2"))
//                list.add("abc9");
//            else
//                System.out.println("next:" + obj);
//        }
//        System.out.println(list);

        //列表迭代器，支持在迭代过程中对元素增删改查
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if(obj.equals("abc2")){
                iterator.add("abc9");
            } else {
                System.out.println("next:" + obj);
            }
        }
        System.out.println(list);


    }

    private static void show(List list) {

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println("next:" + it.next());
        }

        for(int x=0; x<list.size(); x++)
            System.out.println("get:" + list.get(x));

    }


}
