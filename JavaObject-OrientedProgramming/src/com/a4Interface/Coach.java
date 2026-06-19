package com.a4Interface;

/**
 * @className: Coach
 * @description: 抽象教练类继承抽象人类
 * @author: hotel
 * @date: 2026/1/7 12:20
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
