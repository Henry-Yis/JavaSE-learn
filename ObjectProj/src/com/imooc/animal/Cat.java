package com.imooc.animal;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/23 下午1:12
 **/
public class Cat {

    private String name;

    private int age;

    private Double weight;

    private String species;

    public Cat(){
        System.out.println("Cat类的无参构造");
    }

    public Cat(String name, int age, Double weight, String species){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    {
        System.out.println("我是构造代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public void run(){
        {
            System.out.println("我是普通代码块1");
        }

        System.out.println(this.name + " 在跑");

        {
            System.out.println("我是普通代码块2");
        }
    }

    public void run(String name){
        System.out.println(name + "快跑");
    }

    public void eat(){
        System.out.println(this.name + " 在吃鱼");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                ", hashCode='" + this.hashCode() + '\'' +
                '}';
    }
}
