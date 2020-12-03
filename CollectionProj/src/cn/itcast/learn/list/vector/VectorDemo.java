package cn.itcast.learn.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/3 上午11:00
 **/
public class VectorDemo {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.addElement("abc1");
        v.addElement("abc2");
        v.addElement("abc3");
        v.addElement("abc4");


        Enumeration en = v.elements();

        while (en.hasMoreElements()){
            System.out.println("nextElement:" + en.nextElement());
        }

        Iterator it = v.iterator();

        while (it.hasNext()){
            System.out.println("next:" + it.next());
        }


    }


}
