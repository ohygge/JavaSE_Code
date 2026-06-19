package com.a5StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @className: StudentManager
 * @description: 学生信息管理类之键盘输入
 * @author: hotel
 * @date: 2026/1/3 18:11
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrStudets = new ArrayList<>();
        while (true) {
            System.out.println("---欢迎进入学生信息管理系统---");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(arrStudets);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(arrStudets);
                    break;
                case "3":
                    System.out.println("修改学生");
                    modifyStudent(arrStudets);
                    break;
                case "4":
                    System.out.println("查询学生");
                    queryStudent(arrStudets);
                    break;
                case "5":
                    System.out.println("退出系统");
                    System.exit(0); // JVN退出程序
            }
        }
    }

    /**
     * 添加学生
     * @param array
     */
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) { // 判断学号是否重复
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("学号已经被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生地址：");
        String address = sc.nextLine();
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setAddress(address);
        array.add(student);
        System.out.println("添加学生成功！");
    }

    /**
     * 根据sid删除学生
     * @param array
     */
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String line = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(line)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("该学生不存在！");
        } else {
            array.remove(index);
            System.out.println("删除学生成功！");
        }
    }

    /**
     * 根据sid修改学生信息
     * @param array
     */
    public static void modifyStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String line = sc.nextLine();
        int index = -1;
        for (Student s : array) {
            if (s.getSid().equals(line)) {
                index = array.indexOf(s);
            }
        }
        if (index == -1) {
            System.out.println("该学生不存在！");
        } else {
            System.out.println("请输入新的学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("年龄：");
            String age = sc.nextLine();
            System.out.println("地址：");
            String address = sc.nextLine();
            Student s = new Student(line, name, Integer.parseInt(age), address);
            array.set(index, s);
            System.out.println("修改学生成功！");
        }
    }

    /**
     * 查询所有学生信息
     * @param array
     */
    public static void queryStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (Student s : array) {
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    /**
     * 判断添加学生学号是否已存在
     * @param array
     * @param sid
     * @return true表示已存在，false表示不存在
     */
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    
}
