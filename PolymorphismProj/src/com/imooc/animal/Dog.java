package com.imooc.animal;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/25 下午7:46
 **/
public class Dog extends Animal {

    //性别
    private String sex;

    public Dog() {

    }

    public Dog(String name, int month, String sex) {
        this.setMonth(month);
        this.setName(name);
        this.setSex(sex);
    }

    public void sleep(){
        System.out.println("小狗有午睡的习惯");
    }

    @Override
    public void eat() {
        System.out.println("狗爱吃肉...");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
