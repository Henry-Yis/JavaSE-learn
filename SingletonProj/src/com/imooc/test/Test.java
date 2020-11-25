package com.imooc.test;

import com.imooc.singleton.SingletonOne;
import com.imooc.singleton.SingletonTwo;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/25 下午5:41
 **/
public class Test {

    public static void main(String[] args) {

        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();

        System.out.println(one);
        System.out.println(two);

        System.out.println("===============================");

        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();

        System.out.println(one1);
        System.out.println(two1);

    }

}
