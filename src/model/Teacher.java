package model;

import java.util.ArrayList;

public class Teacher {
    private String name;    // 名字
    private String ID;  // 工号
    private String courseName;  //任课课名

    public Teacher(String name, String ID, String courseName) {
        this.name = name;
        this.ID = ID;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "名字：" + name +
                "工号：" + ID +
                "任课：" + courseName;
    }
}
