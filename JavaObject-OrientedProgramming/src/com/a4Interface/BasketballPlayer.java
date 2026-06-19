package com.a4Interface;

/**
 * @className: BasketballPlayer
 * @description: 篮球运动员类继承抽象运动员类
 * @author: hotel
 * @date: 2026/1/7 16:47
 */
public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球技巧");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃篮球运动员专用营养餐");
    }
}
