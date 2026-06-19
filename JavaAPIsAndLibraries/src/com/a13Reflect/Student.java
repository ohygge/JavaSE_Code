package com.a13Reflect;

/**
 * @className: Student
 * @description: 类的功能描述
 * @author: hotel
 * @date: 2026/1/3 18:07
 */
public class Student {
    private String sid;
    String name;
    public int age;
    private String address;

    public Student() {}
    public Student(String sid, String name, int age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    private Student(String sid, String name) {
        this.sid = sid;
        this.name = name;
    }
    private Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "学号：" + sid + " 姓名：" + name + " 年龄：" + age + " 地址：" + address;
    }

    public void study() {
        System.out.println("正在学习！");
    }
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }

    public String getInfo(String name, int age) {
        return "姓名：" + name + " 年龄：" + age;
    }

    private void sayGoodbye() {
        System.out.println("再见！");
    }

}
