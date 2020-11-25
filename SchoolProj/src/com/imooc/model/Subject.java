package com.imooc.model;

/**
 * @Description TODO
 * @Author yishuai
 * @Date 2020/11/24 下午3:08
 **/
public class Subject {

    //成员属性
    //学科名称
    private String subjectName;
    //学科编号
    private String subjectNo;
    //学科年制
    private int subjectLife;
    //报名选修的学生信息
    private Student[] students;
    //报名选修课程的个数
    private int studentNum;

    //无参构造
    public Subject() {
    }

    //带参构造
    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        this.subjectLife = subjectLife;
    }

    public Student[] getStudents() {
        if(this.students == null)
            this.students = new Student[30];
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * 学科介绍的方法
     * @return 专业介绍的相关信息，包括名称、编号、年限
     */
    public String info() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectNo='" + subjectNo + '\'' +
                ", subjectLife=" + subjectLife +
                '}';
    }

    /**
     * 添加学生到学科的学生数组，并累加选报学科个数
     * @param student
     */
    public void addStudent(Student student){
        //将学生保存到数组中
        for(int i=0; i<this.getStudents().length; i++){
            if(this.students[i] == null){
                this.students[i] = student;
                //将学生个数保存在选修个数
                this.studentNum = i+1;
                return;
            }
        }
    }

}
