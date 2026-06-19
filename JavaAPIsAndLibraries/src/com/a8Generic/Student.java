package com.a8Generic;

/**
 * @className: Student
 * @description: 学生类在没写任意构造方法前默认自动提供无参构造
 * @author: hotel
 * @date: 2026/4/9 09:47
 */
public class Student {
    private String name;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
