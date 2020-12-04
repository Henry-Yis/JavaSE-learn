package cn.itcast.learn.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 下午2:12
 **/
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add("abc1");
        set.add("abc2");
        set.add("abc3");
        set.add("abc4");
        set.add("abc4");

        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}
