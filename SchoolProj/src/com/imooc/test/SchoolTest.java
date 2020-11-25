package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;
import com.imooc.model.Teacher;

import java.lang.reflect.Field;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/24 下午3:15
 **/
public class SchoolTest {


    public static void main(String[] args) throws IllegalAccessException {

//        Subject sub1 = new Subject("计算机科学与应用","10001",4);
//        System.out.println(sub1.info());
//
//        Student stu1 = new Student("S01","张三","男",15, sub1);
//        System.out.println(stu1.introduction());
//
//        sub1.addStudent(stu1);
//
//        System.out.println("选报[" + sub1.getSubjectName() + "]学科的学生个数:" + sub1.getStudentNum() + "个");


        Class<?> clazz = Teacher.class;
        Teacher t = new Teacher();

        Field[] declaredFields = clazz.getDeclaredFields();

        setField(t, declaredFields);

        System.out.println(t.toString());

    }

    public static void setField(Teacher t, Field[] declaredFields) throws IllegalAccessException {
        for (Field field : declaredFields){
            field.setAccessible(Boolean.TRUE);

            String typeName = field.getType().getName();
            if (typeName.contains("int")) {
                field.set(t,Integer.parseInt("0"));
            } else {
                field.set(t,"默认值");
            }
        }
    }

}
