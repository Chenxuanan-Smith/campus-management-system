package service;

import model.Student;   // 从 model 包里面的 Student.java 中调用数据
import java.util.ArrayList;

public class StudentService {

    // 用来存所有学生
    private ArrayList<Student> students = new ArrayList<>();

    // 添加学生
    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    // ====== 按照学号查找学生 ======
    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    // ====== 按学号删除学生 ======
    public boolean removeStudent(String studentId) {
        Student foundStudent = findStudent(studentId);
        if (foundStudent != null) {
            students.remove(foundStudent);    // 移除这个对象
            return true;
        }
        return false;
    }

    // ====== 修改学生信息 ======
    public boolean updateStudent(String studentId, Student newInfo) {
        Student foundStudent = findStudent(studentId);
        if (foundStudent == null) {
            return false;
        }
        foundStudent.setName(newInfo.getName());
        return true;
    }

    // ====== 获取学生总数 ======
    public int getStudentCount() {
        return students.size();
    }
}
