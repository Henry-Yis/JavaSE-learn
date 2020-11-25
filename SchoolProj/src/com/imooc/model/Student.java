package com.imooc.model;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/24 下午3:24
 **/
public class Student {

    //成员属性
    //学号
    private String no;
    //名称
    private String name;
    //性别
    private String sex;
    //年龄
    private int age;
    //学科
    private Subject subject;

    //无参构造
    public Student() {
    }

    //带参构造
    public Student(String no, String name, String sex, int age ,Subject subject) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subject = subject;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 学生自我介绍的方法
     * @return 自我介绍的信息：姓名、学号、性别、年龄
     */
    public String introduction() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", subject=" + subject +
                '}';
    }
}
