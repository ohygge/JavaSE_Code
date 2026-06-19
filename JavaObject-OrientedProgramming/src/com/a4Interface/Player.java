package com.a4Interface;

/**
 * @className: Player
 * @description: 抽象运动员类继承抽象人类
 * @author: hotel
 * @date: 2026/1/7 12:20
 */
public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
