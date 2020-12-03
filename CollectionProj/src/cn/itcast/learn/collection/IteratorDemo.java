package cn.itcast.learn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/2 下午7:34
 **/
public class IteratorDemo {

    public static void main(String[] args) {

        Collection coll = new ArrayList();

        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");

//        Iterator iterator = coll.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(Iterator it = coll.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

    }


}
