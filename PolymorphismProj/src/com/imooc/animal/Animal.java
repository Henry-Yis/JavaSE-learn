package com.imooc.animal;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/25 下午6:33
 **/
public class Animal {

    //名称
    private String name;
    //年龄
    private int month;

    public Animal() {
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public static void say(){
        System.out.println("动物间打招呼");
    }

    public void eat(){
        System.out.println("动物都有吃东西的能力");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
