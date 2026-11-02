package model;

import java.util.ArrayList;

public class Student {
    private String name;    // 姓名
    private String studentId;   //学号
    private String className;   //班级
    private String gender;  //性别
    private int age;    //年龄
    private ArrayList<Double> score;    //成绩
    private String phone;   //电话号码

    public Student(String name, String studentId, String className, String gender, int age, ArrayList<Double> score, String phone) {
        this.name = name;
        this.studentId = studentId;
        this.className = className;
        this.gender = gender;
        this.age = age;
        this.score = score;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getClassName() {
        return className;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<Double> getScore() {
        return score;
    }
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(ArrayList<Double> score) {
        this.score = score;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "学号：" + studentId +
                "，姓名：" + name +
                "，班级：" + className +
                "，性别：" + gender +
                "，年龄：" + age +
                "，成绩：" + score +
                "，电话：" + phone;
    }
}
