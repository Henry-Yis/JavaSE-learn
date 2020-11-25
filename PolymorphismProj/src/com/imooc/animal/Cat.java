package com.imooc.animal;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/25 下午7:42
 **/
public class Cat extends Animal{

    //体重
    private double weight;

    public Cat() {
    }

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.weight = weight;
    }

    //方法：跑动
    public void run(){
        System.out.println("小猫在奔跑");
    }

    //方法：吃东西（重写父类方法）
    @Override
    public void eat() {
        System.out.println("猫吃鱼~~");
    }

    public static void say(){
        System.out.println("小猫碰胡须");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
