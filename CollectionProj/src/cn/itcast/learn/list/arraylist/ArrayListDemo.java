package cn.itcast.learn.list.arraylist;

import cn.itcast.learn.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 下午1:52
 **/
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(new Person("list1",21));
        al.add(new Person("list2",22));
        al.add(new Person("list3",23));
        al.add(new Person("list4",24));

        Iterator it = al.iterator();
        while (it.hasNext()) {
//            System.out.println(((Person)it.next()).getName());
            Person p = (Person) it.next();
            System.out.println(p.getName() + "--" + p.getAge());

        }




    }

}
