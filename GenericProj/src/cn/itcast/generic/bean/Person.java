package cn.itcast.generic.bean;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/12/4 下午3:48
 **/
public class Person implements Comparable{

    private String name;

    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        int temp = this.age - p.age;
        return temp==0?this.name.compareTo(p.name):temp;
    }
}
