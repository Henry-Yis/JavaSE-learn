package com.imooc.test;

import com.imooc.animal.Cat;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/24 下午2:24
 **/
public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("花花");
        cat.setAge(3);
        cat.setSpecies("英国短毛猫");
        cat.setWeight(8.0);
        cat.run();
    }

}
