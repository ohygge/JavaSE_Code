package com.a4Interface;

/**
 * @className: BasketballPlayer
 * @description: 乒乓球运动员类继承抽象运动员类
 * @author: hotel
 * @date: 2026/1/7 16:47
 */
public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习篮球技巧");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃乒乓球运动员专用营养餐");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
