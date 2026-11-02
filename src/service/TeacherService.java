package service;

import model.Teacher;   // 引用 model 包里面的 Teacher.java 数据
import java.util.ArrayList;

public class TeacherService {

    // 用来存所有教师
    private ArrayList<Teacher> teachers = new ArrayList<>();

    // 添加教师
    public boolean addTeacher(Teacher teacher) {
        if (teacher == null) return false;

        if (findTeacher(teacher.getID()) != null){
            return false;
        }
        teachers.add(teacher);
        return true;
    }

    // 按工号查找教师
    public Teacher findTeacher(String ID) {
        for (Teacher t : teachers) {
            if (t.getID().equals(ID)) {
                return t;
            }
        }
        return null;
    }

    // 按工号删除教师
    public boolean removeTeacher(String id) {
        Teacher foundTeacher = findTeacher(id);
        if (foundTeacher != null) {
            teachers.remove(foundTeacher);
            return true;
        }
        return false;
    }

    // 修改教师信息
    public boolean updateTeacher(String id, Teacher newInfo) {
        Teacher foundTeacher = findTeacher(id);
        if (foundTeacher == null) {
            return false;
        }

        foundTeacher.setName(newInfo.getName());
        foundTeacher.setCourseName(newInfo.getCourseName());
        return true;
    }

    // 获取总数
    public int getTeacherCount() {
        return teachers.size();
    }
}
