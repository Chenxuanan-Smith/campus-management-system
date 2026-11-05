package model;

public class Teacher {
    private String name;    // 名字
    private String teacherId;  // 工号
    private String courseName;  //任课课名

    public Teacher(String name, String teacherId, String courseName) {
        this.name = name;
        this.teacherId = teacherId;
        this.courseName = courseName;
    }

    public Teacher(String name, String id) {
    }

    public String getName() {
        return name;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "名字：" + name +
                "工号：" + teacherId +
                "任课：" + courseName;
    }
}
