package com.a4Interface;

/**
 * @className: Person
 * @description: 抽象人类
 * @author: hotel
 * @date: 2026/1/7 12:13
 */
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    /**
     * 抽象方法：没有方法体，只有方法名和参数列表
     */
    public abstract void eat();
}
