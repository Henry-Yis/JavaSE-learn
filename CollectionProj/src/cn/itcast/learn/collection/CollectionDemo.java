package cn.itcast.learn.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/2 下午7:22
 **/
public class CollectionDemo {

    public static void main(String[] args) {
        Collection coll = new ArrayList();

        show(coll);
    }


    public static void show(Collection coll){

        //添加元素
        coll.add("abcd1");
        coll.add("abcd2");
        coll.add("abcd3");
        System.out.println(coll);

        //删除
        coll.remove("abcd2");
        System.out.println(coll);

        //清空集合
//        coll.clear();

        boolean contains = coll.contains("abcd2");
        System.out.println(contains);
    }


}
