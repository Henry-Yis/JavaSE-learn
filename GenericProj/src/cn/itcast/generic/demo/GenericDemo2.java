package cn.itcast.generic.demo;

import cn.itcast.generic.bean.Person;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午3:50
 **/
public class GenericDemo2 {

    public static void main(String[] args) {

        TreeSet<Person> ts = new TreeSet<Person>();

        ts.add(new Person("lisi",21));
        ts.add(new Person("lisi3",23));
        ts.add(new Person("lisi2",21));
        ts.add(new Person("lisi4",20));


        Iterator<Person> it = ts.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.getName() + " : " + p.getAge());
        }


    }

}
