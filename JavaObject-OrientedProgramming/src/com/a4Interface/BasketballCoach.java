package com.a4Interface;

/**
 * @className: BasketballCoach
 * @description: 篮球教练类继承抽象教练类
 * @author: hotel
 * @date: 2026/1/7 16:40
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何投球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃篮球");
    }
}
