package com.a4ArrayList;

import java.util.Objects;

/**
 * @className: Student
 * @description: 学生类的自然排序就是让元素所属的类实现Comparable接口重写compareTo方法
 * @author: hotel
 * @date: 2026/1/3 10:18
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public String toString() { //重写toString方法
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { //重写equals方法
        //this --- s1
        //o --- s2向上转型
        //比较地址是否相同
        if (this == o) return true;
        //判断参数是否为null或者两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;
        //比较属性值是否相同
        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Student s) {
        int num1 = this.age - s.age;
        System.out.println("num1 = " + num1);
        int num2 = num1 == 0 ? this.name.compareTo(s.name) : num1;
        System.out.println("num2 = " + num2);
        return num2;
    }
}
