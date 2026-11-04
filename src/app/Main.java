package app;

import service.StudentService;  //从 service 包中的 StudentSerivce.java 中调取数据
import service.TeacherService;  //从 service 包中的 TeacherService.java 中调取数据

import java.util.Scanner;

// 主程序
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        while (true) {
            System.out.println("===== 主菜单 =====");
            System.out.println("1.学生系统");
            System.out.println("2.老师系统");
            System.out.println("3.exit");
            System.out.print("请选择你要进入的界面：");
            int choice = -1;

            try {
                choice = sc.nextInt();
            } catch(Exception e) {
                System.out.println("输入有误，请输入正确的数字! \n");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("进入学生系统");
                    studentMenu(sc, studentService);
                    break;
                case 2:
                    System.out.println("进入老师系统");
                    teacherMenu(sc, teacherService);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("输入错误,请重新输入！");
            }

        }
    }

    // 学生子系统
    public static void studentMenu(Scanner sc,StudentService studentService) {
        while (true) {
            System.out.println("===== 学生管理系统 =====\n");
            System.out.println("1.添加学生");
            System.out.println("2.查找学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生信息");
            System.out.println("5.返回主页");
            System.out.print("请选择你要进入的界面：");
            int choice = -1;

            try {
                choice = sc.nextInt();
            }  catch(Exception e) {
                System.out.println("输入有误，请输入正确的数字! \n");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("请输入密码：");
                    boolean isVerified = false;
                    while (true) {
                        int pwd = -1;
                        try {
                            pwd = sc.nextInt();
                        }  catch(Exception e) {
                            System.out.println("输入有误，请重新输入！");
                            sc.nextLine();
                            continue;
                        }
                        if (pwd == 0) {
                            break;
                        }

                        if (pwd != 12345) {
                            System.out.println("密码错误，请重试！");
                        } else {
                            System.out.println("密码正确");
                            isVerified = true;
                        }

                        if (isVerified) {
                            System.out.println("正在进入系统……");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入你要查找的学生学号：");
                    String studentId = sc.next();
                    Student foundStudent = studentService.findStudent(studentId);
                    if (foundStudent != null) {
                        System.out.println("找到了该学生");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("该学生不存在");
                    }
                    break;
                case 3:
                    System.out.print("请输入密码：");
                    boolean isVerified2 = false;
                    while (true) {
                        int pwd = -1;
                        try {
                            pwd = sc.nextInt();
                        }  catch(Exception e) {
                            System.out.println("输入有误，请重新输入！");
                            sc.nextLine();
                            continue;
                        }
                        if (pwd == 0) {
                            break;
                        }

                        if (pwd != 12345) {
                            System.out.println("密码错误，请重试！");
                        } else {
                            System.out.println("密码正确");
                            isVerified = true;
                        }

                        if (isVerified2) {
                            System.out.println("正在进入系统……");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("请输入密码：");
                    boolean isVerified3 = false;
                    while (true) {
                        int pwd = -1;
                        try {
                            pwd = sc.nextInt();
                        }  catch(Exception e) {
                            System.out.println("输入有误，请重新输入！");
                            sc.nextLine();
                            continue;
                        }
                        if (pwd == 0) {
                            break;
                        }

                        if (pwd != 12345) {
                            System.out.println("密码错误，请重试！");
                        } else {
                            System.out.println("密码正确");
                            isVerified3 = true;
                        }

                        if (isVerified3) {
                            System.out.println("正在进入系统……");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("返回主页");
                    return;
                default:
                    System.out.println("输入错误,请重新输入！");
            }
        }
    }

    // 教师子系统
    public static void teacherMenu(Scanner sc,TeacherService teacherService) {
        while (true) {
            System.out.println("===== 教师管理系统 =====\n");
            System.out.println("1.添加教师");
            System.out.println("2.查找教师");
            System.out.println("3.删除教师");
            System.out.println("4.修改教师信息");
            System.out.println("5.返回主页");
            System.out.print("请选择你要进入的界面：");
            int choice = -1;

            try {
                choice = sc.nextInt();
            }  catch(Exception e) {
                System.out.println("输入有误，请输入正确的数字! \n");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1, 3, 4:
                    System.out.println("请输入密码：");

                    break;
                case 2:
                    System.out.println("请输入你要查找的教师工号：");
                    break;
                case 5:
                    System.out.println("返回主页");
                    return;
                default:
                    System.out.println("输入错误,请重新输入！");
            }
        }
    }
}

