package cn.itcast.learn.set.hashset;

import cn.itcast.learn.bean.Person;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 下午2:45
 **/
public class HashSetTest {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add(new Person("set1",21));
        hs.add(new Person("set2",22));
        hs.add(new Person("set3",23));
        hs.add(new Person("set4",24));
        hs.add(new Person("set4",24));

        Iterator it = hs.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p.getName() + "...." +p.getAge());
        }

    }

}
