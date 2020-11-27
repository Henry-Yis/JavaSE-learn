package com.imooc.test;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/27 上午9:54
 **/
public class TryDemoOne {

    public static void main(String[] args) {
        /**
         * 要求：定义两个整数，输出两数之商
         * int one = 12;
         * int two = 2;
         */

        Scanner input = new Scanner(System.in);
        System.out.println("=====运算开始=====");
        try{
            System.out.println("请输入第一个整数：");
            int one = input.nextInt();
            System.out.println("请输入第二个整数：");
            int two = input.nextInt();
            System.out.println("两数之商：" + (one/two));
        }catch (Exception e){
            System.out.println("程序出错啦～～");
            e.printStackTrace();
        }finally {
            System.out.println("=====运算结束=====");
        }

    }

}
