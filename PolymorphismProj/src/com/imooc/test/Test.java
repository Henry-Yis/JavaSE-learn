package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/25 下午7:52
 **/
public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();

    }

}
